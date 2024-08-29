//traversal by level order
//inorder traversal
import  java.util.*;
public class BT5{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int index = -1;
        public static Node buildtree(int node[]){
            index++;
            if(node[index] == -1){
                return null;
            }
            Node newnode = new Node(node[index]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);

            return newnode; //root return hua
        }

        public static void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(node);
        tree.levelorder(root);
    }
}
//post order traversal
//inorder traversal
import  java.util.*;
public class BT4{
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

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(node);
        tree.postorder(root);
    }
}
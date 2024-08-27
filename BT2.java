//preorder  traversal
public class BT2{
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
    static class Binarytree{
        static int index = -1;
        public static Node buildtree(int node[]) {
            index++;
            if(node[index] == -1){
                return null;
            }
            Node newnode = new Node(node[index]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);

            return newnode;
        }
        
    //traveral using preorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    }
    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(node);
        tree.preorder(root);
    }
}
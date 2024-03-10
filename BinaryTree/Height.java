package BinaryTree;
public class Height{
    public static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        
        int left=height(root.left);
        int right=height(root.right);
        
        return Math.max(left,right)+1;
    }
    
    public static void main(){
        Node root=new Node(1);
        root.left=new Node(2);root.right=new Node(3);
        root.left.left=new Node(4);root.left.right= new Node(5);root.right.left=new Node(6);root.right.right=new Node(7);
        
        //         1
        //      /     \
        //     2       3
        //   /   \   /   \
        //  4     5  6    7 
        
        
        System.out.println("HEIGHT = "+height(root));
    }
}
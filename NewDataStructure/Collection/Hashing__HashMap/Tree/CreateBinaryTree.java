package NewDataStructure.Collection.Hashing__HashMap.Tree;
import java.util.Scanner;


public class CreateBinaryTree {

    Node root;
    Scanner sc;

    public CreateBinaryTree(){
        sc=new Scanner(System.in);
    }



//// Create Binary Tree
    Node createBinaryTree(){
        System.out.println("Enter Node data : ");

        int data=sc.nextInt();
        if(data==-1)return null;
        Node newNode=new Node(data);

        System.out.println("Enter "+data+"'s left data");
        newNode.left=createBinaryTree();
        
        System.out.println("Enter "+data+"'s right data");
        newNode.right =createBinaryTree();
        
        return newNode;
    }


//// Inorder-Traversal
    public static void inorderTraversal(Node root){

        if(root==null)return;

        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }
    
    public static void main(String[] args) {
        CreateBinaryTree tree =new CreateBinaryTree();

        Node rot=tree.createBinaryTree();
        
        inorderTraversal(rot);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}

package NewDataStructure.Collection.Hashing__HashMap.Tree;

import java.util.Scanner;

public class PostOrder_Traversal {
    
    Node root;
    Scanner sc;

    PostOrder_Traversal(){
        sc=new Scanner(System.in);
    }

    /// Creating Tree
    Node createTree(){
        System.out.println("Enter a Node: ");
        int data=sc.nextInt();
        if(data==-1)return null;

        Node newNode =new Node(data);
        System.out.println("Enter "+data+"'s left node data : ");
        newNode.left=createTree();
        System.out.println("Enter "+data+"'s right node data : ");
        newNode.right=createTree();
        return newNode;
    }


    //// POST_ORDER--Traversal
    static void postorder_Traversal(Node root){
        if(root==null)return;

        postorder_Traversal(root.left);
        postorder_Traversal(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        PostOrder_Traversal tree =new PostOrder_Traversal();

        Node root=tree.createTree();
        postorder_Traversal(root);
    }

}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}
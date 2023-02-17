package NewDataStructure.Collection.Hashing__HashMap.Tree;

import java.util.Scanner;

public class PreOrder_Traversal {
    Node root;
    Scanner sc;

    PreOrder_Traversal(){
       sc=new Scanner(System.in); 
    }

    Node createTree(){
        System.out.println("Enter a Node data: ");
        int data=sc.nextInt();
        if(data==-1)return null;
        Node newNode=new Node(data);

        System.out.println("Enter "+data+"'s left node data: ");
        newNode.left=createTree();
        System.out.println("Enter "+data+"'s right node data: ");
        newNode.right=createTree();
        return newNode;
    }


    //// PreOrder Traversal
    public static void preorder_Traversal(Node root){
        if(root==null)return ;

        System.out.println(root.data);
        preorder_Traversal(root.left);
        preorder_Traversal(root.right);
    }


    public static void main(String[] args) {
        PreOrder_Traversal tree =new PreOrder_Traversal();
        Node root=tree.createTree();
        preorder_Traversal(root);
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
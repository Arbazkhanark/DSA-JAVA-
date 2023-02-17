package NewDataStructure.Collection.Hashing__HashMap.Tree;
import java.util.Scanner;

public class HeightOfTree {
    Node root;
    Scanner sc;

    HeightOfTree(){
        sc=new Scanner(System.in);
    }

    Node  createTree(){
        System.out.println("Enter Node Data: ");
        int data=sc.nextInt();
        if(data==-1)return null;

        Node newNode=new Node(data);

        System.out.println("Enter "+data+"'s left node data: ");
        newNode.left=createTree();        
        System.out.println("Enter "+data+"'s right node data: ");
        newNode.right=createTree();
        return newNode;
    }


    ////Height of Tree
    static int heightOfTree(Node root){
        if(root==null)return 0;
    
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {
        HeightOfTree tree =new HeightOfTree();
        Node root=tree.createTree();

        System.out.println(heightOfTree(root));

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

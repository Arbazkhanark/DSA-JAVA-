package NewDataStructure.Collection.Hashing__HashMap.Tree;
import java.util.Scanner;


public class PrintAllNodesPresentAtDistanceK {
    
    Node root;
    Scanner sc;

    PrintAllNodesPresentAtDistanceK(){
        sc=new Scanner(System.in);
    }

    Node createTree(){
        System.out.println("Enter Node data: ");
        int data=sc.nextInt();

        if(data==-1)return null;
        Node newNode=new Node(data);

        System.out.println("Enter "+data+"'s Left Node data: ");
        newNode.left=createTree();        
        System.out.println("Enter "+data+"'s Right Node data: ");
        newNode.right=createTree();

        return newNode;
    }
    

    //// It will print the All Nodes Present at Distance K.....
    static void print_Nodes_Present_At_Distance_K(Node root, int k){
        if(root==null)return;
        if(k==0){
            System.out.println(root.data);
            return;
        }

        print_Nodes_Present_At_Distance_K(root.left, k-1);
        print_Nodes_Present_At_Distance_K(root.right, k-1);
    }


    public static void main(String[] args) {
        PrintAllNodesPresentAtDistanceK tree=new PrintAllNodesPresentAtDistanceK();
        Node root=tree.createTree();

        int k=2;
        print_Nodes_Present_At_Distance_K(root, k);
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
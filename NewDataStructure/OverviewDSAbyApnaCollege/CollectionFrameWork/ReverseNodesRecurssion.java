package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

public class ReverseNodesRecurssion {
    
    public static Node reverseNodeRecurssion(Node head){

        if(head==null || head.next==null)return head;
        Node temp=head.next;
        Node newNode=reverseNodeRecurssion(head.next);
        temp.next=head;
        head.next=null;
        return newNode;
    }

    public static void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(60);
        Node n4=new Node(30);
        Node n5=new Node(40);
        Node n6=new Node(50);
    
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;

        printLL(head);
        printLL(reverseNodeRecurssion(head));

    }



}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
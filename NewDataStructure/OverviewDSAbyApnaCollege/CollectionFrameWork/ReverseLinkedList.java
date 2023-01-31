package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

///// Go to Online Compiler for Execution;
public class ReverseLinkedList {

    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;

        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static void printLLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1=new Node(12);
        Node n2=new Node(19);
        Node n3=new Node(13);
        Node n4=new Node(11);
        Node n5=new Node(20);


        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        printLLL(head);
        printLLL(reverse(head));
        // printLLL(head);
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

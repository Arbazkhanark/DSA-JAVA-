package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;
class LL{

    public static void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.Data+" -> ");
            curr=curr.next;

        }
        System.out.print("end");
    }

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(40);
        Node n4=new Node(50);
        Node n5=new Node(60);
        Node n6=new Node(70);
        Node n7=new Node(80);
        Node n8=new Node(90);


        Node head=n1; // head= n1
        n1.next=n2;   //Node point to next node
        n2.next=n3;   //Node point to next node
        n3.next=n3;   //Node point to next node
        n4.next=n5;   //Node point to next node
        n5.next=n6;   //Node point to next node
        n6.next=n7;   //Node point to next node
        n7.next=n8;
        // n8.next=null; //Last Node next pointer is Always Null


        printLL(head);


    }
}

class Node{
    int Data;
    Node next;


    public Node(int data){
        this.Data=data;
    }
}
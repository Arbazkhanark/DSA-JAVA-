package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

public class MiddleNode {
    public static void traverse(Node head){
        Node curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        System.out.println(length);

        // Node newNode=head;
        curr=head;
        for(int i=0;i<length/2;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args) {
        
        Node n1=new Node(10);
        Node n2=new Node(16);
        Node n3=new Node(11);
        Node n4=new Node(12);
        Node n5=new Node(14);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        traverse(head);
    }
}



class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}

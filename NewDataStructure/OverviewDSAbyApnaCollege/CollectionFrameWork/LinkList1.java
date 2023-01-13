package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;
class LL{

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        Node head=n1; // head= n1
        n1.next=n2;   //Node point to next node
        n2.next=n3;   //Node point to next node
        n3.next=null; //Last Node next pointer is Always Null
    }
}

class Node{
    int Data;
    Node next;


    public Node(int data){
        this.Data=data;
    }
}
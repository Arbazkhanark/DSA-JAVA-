package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;
class LL{

    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        
        n1.next=n2;
        n2.next=n3;
        n3.next=null;
    }
}

class Node{
    int Data;
    Node next;


    public Node(int data){
        this.Data=data;
    }
}
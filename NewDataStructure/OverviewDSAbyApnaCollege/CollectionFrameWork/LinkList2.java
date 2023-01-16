package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

class Main{

    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        Node n1=new Node(12);
        Node n2=new Node(16);
        Node n3=new Node(0);
        Node n4=new Node(3);
        Node n5=new Node(20);

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
package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// class LL{

//     public static void printLL(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" -> ");
//             curr=curr.next;

//         }
//         System.out.print("end");
//     }

//     public static void main(String[] args) {
//         Node n1=new Node(10);
//         Node n2=new Node(20);
//         Node n3=new Node(40);
//         Node n4=new Node(50);
//         Node n5=new Node(60);
//         Node n6=new Node(70);
//         Node n7=new Node(80);
//         Node n8=new Node(90);


//         Node head=n1; // head= n1
//         n1.next=n2;   //Node point to next node
//         n2.next=n3;   //Node point to next node
//         n3.next=n4;   //Node point to next node
//         n4.next=n5;   //Node point to next node
//         n5.next=n6;   //Node point to next node
//         n6.next=n7;   //Node point to next node
//         n7.next=n8;
//         // n8.next=null; //Last Node next pointer is Always Null


//         printLL(head);


//     }
// }

// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data=data;
//     }
// }


class LinkList{
    public static void printLinkedList(Node head){
        Node newNode=head;
        while(newNode!=null){
            System.out.println(newNode.Data);
            newNode=newNode.next;
        }
        System.out.println(newNode);
    }



    public static Node insertLL(int data,int position,Node head){
        Node newNode1=new Node(data);

        if(position==0){
            newNode1.next=head;
            head=newNode1;
            return head;
        }

        Node curr=head;
        for(int i=0;i<position-1;i++){
            curr=curr.next;
        }
        newNode1.next=curr.next;
        curr.next=newNode1;
        // printLinkedList(head);

        return head;
    }

    public static void main(String[] args) {

        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Node n6=new Node(60);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        // n6.next=null;
        
        printLinkedList(head);
        head=insertLL(2000, 0, head);
        printLinkedList(head);

    }
}

class Node{
    int Data;
    Node next;

    public Node(int data){
        this.Data=data;
    }
}
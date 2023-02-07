package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// public class deleteNodeLL {

//     public static void printLinked(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.println(curr.Data);
//             curr=curr.next;
//         }
//         System.out.println(curr);
//     }


//     public static void main(String[] args) {
        
//         Node str1=new Node("Hey");
//         Node str2=new Node("I");
//         Node str3=new Node("Am");
//         Node str4=new Node("Not");
//         Node str5=new Node("Arbaaz");
//         Node str6=new Node("Khan");

//         Node head=str1;
//         str1.next=str2;
//         str2.next=str3;
//         str3.next=str4;
//         str4.next=str5;
//         str5.next=str6;

//         printLinked(head);
//     }
// }

// class Node{
//     String Data;
//     Node next;

//     public Node(String data){
//         this.Data=data;
//     }
// }


public class deleteNodeLL {

    public static void printLinked(Node1 head){
        Node1 curr=head;
        while(curr!=null){
            System.out.println(curr.Data);
            curr=curr.next;
        }
        System.out.println(curr);
    }


    public static void delete(int position,Node1 head){

        Node1 curr=head;
        for(int i=0;i<position-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }

    public static void main(String[] args) {
        
        Node1 str1=new Node1(10);
        Node1 str2=new Node1(20);
        Node1 str3=new Node1(30);
        Node1 str4=new Node1(30);
        Node1 str5=new Node1(40);
        Node1 str6=new Node1(50);
        Node1 str7=new Node1(60);

        Node1 head=str1;
        str1.next=str2;
        str2.next=str3;
        str3.next=str4;
        str4.next=str5;
        str5.next=str6;
        str6.next=str7;

        printLinked(head);
        delete(4, head);
        printLinked(head);
    }
}

class Node1{
    int Data;
    Node1 next;

    public Node1(int data){
        this.Data=data;
    }
}




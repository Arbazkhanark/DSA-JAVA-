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

    public static void printLinked(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.Data);
            curr=curr.next;
        }
        System.out.println(curr);
    }


    public static void delete(int position,Node head){

        Node curr=head;
        for(int i=0;i<position-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
    }

    public static void main(String[] args) {
        
        Node str1=new Node(10);
        Node str2=new Node(20);
        Node str3=new Node(30);
        Node str4=new Node(30);
        Node str5=new Node(40);
        Node str6=new Node(50);
        Node str7=new Node(60);

        Node head=str1;
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

class Node{
    int Data;
    Node next;

    public Node(int data){
        this.Data=data;
    }
}




// package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// class Main{

//     public Node head=null;
//     public Node next=null;

//     public static void AddFirst(Node head,int data){
//         Node n0=new Node(data);

//         if(head==null){
//             head=n0;
            
//         }else{
//             Node temp=head;

//             head=n0;

//             head.next=temp;
//         }
//     }

//     public static void traverse(Node head){
//         Node curr=head;
//         if(head==null){
//             System.out.println("List is Empty");
//         }
//         while(curr!=null){
//             System.out.print(curr.next+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
        
//         Node n1=new Node(10);
//         Node n2=new Node(20);
//         Node n3=new Node(30);
//         Node n4=new Node(40);

//         Node head =n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;

//         traverse(head);

//     }
// }

// class Node{
//     int Data;
//     Node next;

//     public Node(int data){
//         this.Data=data;
//     }
// }
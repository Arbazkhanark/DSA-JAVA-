// package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// ////////// Go to Online Compiler for Execution;
// class FindMiddleNode{

//     public static void middle(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         System.out.println(slow.data);

//     }
//     public static void main(String[] args) {
//         Node n1=new Node(12);
//         Node n2=new Node(1);
//         Node n3=new Node(10);
//         Node n4=new Node(13);
//         Node n5=new Node(11);


//         Node head=n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;

//         middle(head);
        
//     }
// }

// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data=data;
//     }
// }
// package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// public class IsCycleInNode {

//     public static boolean isCycle(Node head){

//         if(head==null && head.next==null) return false;
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null){
//             slow=slow.next;
//             fast=fast.next.next;

//             if(slow==fast){
//                 return true;
//             }
//         }
//         return false;
//     }
    
//     public static void main(String[] args) {
        
//         Node n1=new Node(10);
//         Node n2=new Node(12);
//         Node n3=new Node(14);
//         Node n4=new Node(16);
//         Node n5=new Node(17);
//         Node n6=new Node(20);

//         Node head =n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         n5.next=n6;
//         n6.next=n2;     ///////  Here is Cycle present

//         isCycle(head);

//         if(isCycle(head)==true){
//             System.out.println("Cycle is Present :)");
//         }else{
//             System.out.println("Cycle is not Present :)");
//         }
//     }
// }

// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data=data;
//     }
// }
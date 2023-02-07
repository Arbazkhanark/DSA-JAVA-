// package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;


// public class MergeTwoSortedLL {

//     public static Node merge(Node head1,Node head2){
//         Node dummyNode= new Node(0);
//         Node temp=dummyNode;
//         Node c1=head1;
//         Node c2=head2;

//         if(c1==null) return c2;
//         if(c2==null)return c1;


//         while(c1!=null && c2!=null){

//             if(c1.data<=c2.data){
//                 temp.next=c1;
//                 c1=c1.next;
//             }else {
//                 temp.next=c2;
//                 c2=c2.next;
//             }
//             temp=temp.next;
//         }
//         return dummyNode;
//     }     
    
//     public static void print(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data);
//             curr=curr.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node n1=new Node(1);
//         Node n2=new Node(3);
//         Node n3=new Node(4);
//         Node n4=new Node(6);
//         Node n5=new Node(8);
        
//         Node m1=new Node(1);
//         Node m2=new Node(2);
//         Node m3=new Node(5);
//         Node m4=new Node(7);
//         Node m5=new Node(9);
        
//         Node head1=n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
        
//         Node head2=m1;
//         m1.next=m2;
//         m2.next=m3;
//         m3.next=m4;
//         m4.next=m5;
        
//         print(head1);
//         print(head2);
        
//         print(merge(head1,head2));
//     }
// }




//  class Node{
//     int data;
//     Node next;
    
//     public Node(int data){
//         this.data=data;
//     }
// }


// package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

// public class RecurssionReverseInGroupLL {

//     public static Node1 reverseLL(Node1 head ,int k){
//         if(head==null)return head;

//         Node1 prev=null;
//         Node1 curr=head;
//         Node1 nextNode=null;

//         int count=0;
//         while(curr!=null && count<k){
//             nextNode=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=nextNode;
//             count++;
//         }

//         if(nextNode!=null){
//             head.next=reverseLL(nextNode, k);
//         }
//         return prev;
//     }

//     public static void printLinkedListLL(Node1 head){
//         Node1 curr=head;
//         while(curr!=null){
//             System.out.print(curr.data);
//             curr=curr.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
        
//         Node1 n1=new Node1(12);
//         Node1 n2=new Node1(13); 
//         Node1 n3=new Node1(14);
//         Node1 n4=new Node1(15);
//         Node1 n5=new Node1(16);
//         Node1 n6=new Node1(17);

//         Node1 head=n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         n5.next=n6;

//         int k=3;

//         printLinkedListLL(head);
//         printLinkedListLL(reverseLL(head, k));
        


//     }
// }

// class Node1{
//     int data;
//     Node1 next;

//     public Node1(int data){
//         this.data=data;
//     }
// }
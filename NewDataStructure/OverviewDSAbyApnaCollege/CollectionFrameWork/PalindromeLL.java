package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;


public class PalindromeLL {
    public static Node middle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
        // System.out.println(slow.data);
    }

    public static Node rev(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node nexttt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nexttt;
        }
        return prev;
    }

    public static Boolean issPalindrome(Node head){
        if(head==null || head.next==null) return true;

        Node mid=middle(head);
        Node reverse =rev(mid);

        Node curr=head;
        Node last=reverse;
        while(curr!=null){
            if(curr.data!=last.data){
                return false;
            }else {
                last=last.next;
                curr=curr.next;

            }
        }
        return true;
    }


    public static void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);         
        Node n3=new Node(3);
        Node n4=new Node(2);
        Node n5=new Node(1);
        // Node n6=new Node(3);

        Node head =n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        // n5.next=n6;

        print(head);
        // middle(head);
        print(middle(head));
        // print(rev(head));
        System.out.println(issPalindrome(head));

    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

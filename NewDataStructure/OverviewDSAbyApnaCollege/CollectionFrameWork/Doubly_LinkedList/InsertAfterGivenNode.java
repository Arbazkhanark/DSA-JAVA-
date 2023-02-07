package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork.Doubly_LinkedList;


public class InsertAfterGivenNode {

    class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data=data;
        }
    }

    Node head,tail=null;

    /////// Insert the Nodes 
    public void addNodes(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
        System.out.print(newNode.data);
    }


    ///////// Print the Nodes 
    public void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    InsertAfterGivenNode dList = new InsertAfterGivenNode();  
        //Add nodes to the list  
        dList.addNodes(1);  
        dList.addNodes(2);  
        dList.addNodes(3);  
        dList.addNodes(4);  
        dList.addNodes(5);  

        // print(dList);
        Node head=null;
        dList.print(head);
        // dList.addNodes(4);
    }
}



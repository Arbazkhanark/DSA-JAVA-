package NewDataStructure.Collection.Hashing__HashMap.Stack.UsingLinkedLink;

public class ImplimentionStackUsingLinkedList {
    
    Node head;
    int size=0;

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    void push(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        size++;
    }

    int pop()throws Exception{
        if(head==null) throw new Exception("Stack is Empty :(");
        int poped=head.data;
        head=head.next;
        size--;                                 ////  1 3 5 7 8 
        return poped;
    }

    Boolean isEmpty(){
        if(head==null) return true;
        return false;
    }

    int peek()throws Exception {
        if(head==null) throw new Exception("Nothing on Head!!! Empty Stack");
       return head.data; 
    }

    int size(){
        return size;
    }

}

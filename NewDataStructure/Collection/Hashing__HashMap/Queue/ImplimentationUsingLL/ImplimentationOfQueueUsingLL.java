package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingLL;

public class ImplimentationOfQueueUsingLL {
    Node front;
    Node rear;

    void enqueue(int data){
        Node newNode =new Node(data);
        if(!isEmpty()){
            rear.next=newNode;
            rear=newNode;
            rear.next=null;
        }else{
            front=rear=newNode;
        }
    }  

    int dequeue()throws Exception {
        if(isEmpty()) throw new Exception("Queue is Clean!!!");
        int deleted=front.data;
        front=front.next;
        return deleted;
    }
    
    Boolean isEmpty(){
        if(front==null)return true;
        return false;
    }

    int getFront() throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty!!!!!");
        return front.data;
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
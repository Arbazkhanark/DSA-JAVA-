package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingCircularArray;

public class ImplimentationUsingCircularArray {
    
    int arr[];
    int capacity;
    int front,rear;
    int x=0;
    public ImplimentationUsingCircularArray(int capacity){
        this.capacity=capacity;
        front=-1;rear=-1;
        arr=new int[capacity];
    }


    void enqueue(int element)throws Exception{
        if(isFull())throw new Exception("Full OverFlow");
        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=element;
    }

    int dequeue()throws Exception{
        if(isEmpty())throw new Exception("Empty UnderFlow!!!");
        int ans=arr[front];
        front=(front+1)%arr.length;
        rear=(rear+1)%arr.length;
        return ans;
    }

    boolean isFull(){
        if((rear+1)%arr.length ==front) return true;
        return false;
    }

    boolean isEmpty(){
        if(rear==-1)return true;
        return false;
    }
}

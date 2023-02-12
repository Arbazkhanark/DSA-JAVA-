package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingArray;

public class ImplimentationUsingArray {
    int arr[];
    int capacity;
    int front,rear;
    int x=0;
    public ImplimentationUsingArray(int capacity){
        this.capacity=capacity;
        front=-1;rear=-1;
        arr=new int[capacity];
    }
                                                                                            

    void enqueue(int element) throws Exception{
        if(rear>=capacity) throw new Exception("OverFlow!!!!");
        if(isEmpty()){
            front=0;
        }
        rear++;
        arr[rear]=element;
    }

    int dequeue()throws Exception{
        if(isEmpty())throw new Exception("Queue UnderFlow!!!!");
        int ans=arr[front];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return ans;
    }


    boolean isEmpty(){
        if(front==-1 && rear==-1)return true;
        return false;
    }
}

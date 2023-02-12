package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingLL;

public class UsingQueueImplimentationLL {

    public static void main(String[] args) throws Exception {
        ImplimentationOfQueueUsingLL q=new ImplimentationOfQueueUsingLL();
    
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.getFront());
        System.out.println(q.isEmpty());
    }

}

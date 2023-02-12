package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingCircularArray;

public class UsingCircularArrayImpli {
    public static void main(String[] args)throws Exception {
        ImplimentationUsingCircularArray queue=new ImplimentationUsingCircularArray(4);

        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(14);
        queue.enqueue(16);

        System.out.println(queue.isFull());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}

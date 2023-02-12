package NewDataStructure.Collection.Hashing__HashMap.Queue.ImplimentationUsingArray;

public class UsingArrayImelimentation {
    
    public static void main(String[] args) throws Exception{
        ImplimentationUsingArray queue =new ImplimentationUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }

}

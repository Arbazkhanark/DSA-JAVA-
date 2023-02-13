package NewDataStructure.Collection.Hashing__HashMap.Queue.QueueProblems;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

// reverse the first k elements from queue;
public class Reverse_K_element_In_Queue {
    
    public static Queue<Integer> reverse(Queue<Integer> queue,int k){
        if(k>queue.size() || queue.isEmpty())return queue;
        Stack<Integer> stack =new Stack<>();

        for(int i=0;i<k;i++){
            stack.push(queue.poll());
            // queue.add(stack.pop());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue =new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(reverse(queue, 3));
    }
}

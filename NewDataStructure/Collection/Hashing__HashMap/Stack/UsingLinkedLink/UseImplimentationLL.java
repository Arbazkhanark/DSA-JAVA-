package NewDataStructure.Collection.Hashing__HashMap.Stack.UsingLinkedLink;

import java.util.ArrayDeque;
import java.util.Stack;

public class UseImplimentationLL {
    
    public static void main(String[] args) throws Exception {
        
        ImplimentionStackUsingLinkedList stack=new ImplimentionStackUsingLinkedList();
        // Stack<Integer> stack=new Stack<>();
        // ArrayDeque<Integer> stack=new ArrayDeque<>();
         
        // stack.push(6);
        // stack.push(4);
        // stack.push(7);
        // stack.push(3);
        
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}

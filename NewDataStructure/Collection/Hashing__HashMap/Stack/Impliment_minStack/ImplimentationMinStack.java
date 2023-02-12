package NewDataStructure.Collection.Hashing__HashMap.Stack.Impliment_minStack;

import java.util.MissingFormatArgumentException;
import java.util.Stack;

public class ImplimentationMinStack {
    
        Stack<Integer> stack =new Stack<>();
        Stack<Integer> MinStack =new Stack<>();

        void push(int data){
            int pushed=stack.push(data);
            if(MinStack.isEmpty()){
                MinStack.push(data);
            }
            if(!MinStack.isEmpty() && MinStack.peek()>=pushed){
                MinStack.push(data);
            }
        }

        int pop() throws Exception{
            if(stack.isEmpty()) throw new Exception("Stack is Empty");
            int poped=stack.pop();
            if(MinStack.peek()==poped){
                MinStack.pop();
            }
            return poped;
        }

        int min() throws Exception{
            if(MinStack.isEmpty()) throw new Exception("Stack is Empty");
            return MinStack.peek();
        }

        public static void main(String[] args) throws Exception{
            ImplimentationMinStack minStack=new ImplimentationMinStack();
            minStack.push(12);
            minStack.push(10);
            minStack.push(3);
            minStack.pop();
            minStack.pop();
            System.out.println(minStack.min()); 
        }
}



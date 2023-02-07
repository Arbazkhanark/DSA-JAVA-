package NewDataStructure.Collection.Hashing__HashMap.Stack.UsingArray;

public class UseImplimentation {
    public static void main(String[] args) throws Exception {
        ImplimentionUsingArrayStack stack=new ImplimentionUsingArrayStack(3);
        
        stack.push(7);
        stack.push(2);
        stack.push(4);
        // stack.push(1);

        System.out.println("Is Stack Empty: "+stack.isEmpty());
        System.out.println("Size: "+stack.size());
        System.out.println(stack.peek());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}

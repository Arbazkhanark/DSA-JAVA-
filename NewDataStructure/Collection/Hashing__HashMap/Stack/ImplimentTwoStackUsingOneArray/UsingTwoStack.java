package NewDataStructure.Collection.Hashing__HashMap.Stack.ImplimentTwoStackUsingOneArray;

public class UsingTwoStack {
    public static void main(String[] args) throws Exception{
        ImplimentationTwoStack stack=new ImplimentationTwoStack(5);

        stack.push1(5);
        stack.push1(3);
        stack.push1(3);
        stack.push1(3);
        // stack.push1(3);
        // stack.push1(3);
   

        // stack.pop1();
        // stack.pop1();
        // stack.pop1();
        // stack.pop1();
        // stack.pop1();
        // stack.pop1();
        // stack.pop1();
        stack.pop2();
        stack.pop2();
        // stack.pop2();


        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(stack.isEmpty1());
        System.out.println(stack.isEmpty2());
        // System.out.println(stack.size1());
        // System.out.println(stack.size2());
    }
}

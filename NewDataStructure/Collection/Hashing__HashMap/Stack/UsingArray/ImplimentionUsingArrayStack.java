package NewDataStructure.Collection.Hashing__HashMap.Stack.UsingArray;

public class ImplimentionUsingArrayStack {
    
    int top;
    int capacity;
    int arr[];

    public ImplimentionUsingArrayStack(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }

    Boolean push(int element)throws Exception{ 
        if(top==capacity-1) throw new Exception("Stack is Full");
        top++;
        arr[top]=element;
        return true;
    }

    int pop() throws Exception{
        if(top==-1) throw new Exception("Stack is Empty");
        int ans=arr[top];
        top--;
        return ans;
    }

    int peek(){
        if(top==-1) return -1;
        // int seek=arr[top];

        // return seek;
        return arr[top];
    }


    Boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }

    int size(){
        if(top==-1) return 0;
        return top+1;

    }
}

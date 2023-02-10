package NewDataStructure.Collection.Hashing__HashMap.Stack.ImplimentTwoStackUsingOneArray;

public class ImplimentationTwoStack {
   
    int top1;
    int top2;
    int arr[];
    int capacity;
    int count1;
    int count2;

    public ImplimentationTwoStack(int capacity){
        this.capacity=capacity;
        top1=-1;
        top2=capacity;
        arr=new int[capacity];
        count1=0;
        count1=0;
    }
   
    public Boolean push1(int data)throws Exception{
        if(top1+1==top2 && top1==capacity)throw new Exception("Stack Is Full");
        top1++;count1++;
        arr[top1]=data;
        return true;
    }

    public Boolean push2(int data)throws Exception{
        if(top1+1==top2)throw new Exception("Stack Is Full");
        top2--;count2++;
        arr[top2]=data;
        return true;
    }

    public int pop1()throws Exception{
        if(top1==-1)throw new Exception("Stack Is Empty1  !!!");
        int res=arr[top1];
        top1--;count1--;
        return res;
    }   
    
    public int pop2()throws Exception{
        if(top2==capacity)throw new Exception("Stack Is Empty2 !!!!");
        int res=arr[top2];
        top2++;count2--;
        return res;
    }

    public int peek1(){
        return arr[top1];
    }    
    
    public int peek2(){
        return arr[top2];
    }


    public Boolean isEmpty1(){
        if(top1==-1)return true;
        return false;
    }    
    
    public Boolean isEmpty2(){
        if(top2==capacity)return true;
        return false;
    }


    public int size1(){
        return count1;
    }

    public int size2(){
        return count2;
    }
}

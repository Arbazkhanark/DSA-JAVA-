package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.Stack;

public class NearestSmallestElement {
    
    public static void smallest(int arr[]){
        int res[]=new int[arr.length];
        Stack<Integer> stack=new Stack<>();

        int k=0;
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                res[k++]=-1;
            }else{
                int prev=stack.peek();
                int curr=stack.push(arr[i]);

                if(prev<curr){
                    res[k++]=prev;
                    stack.push(arr[i]);
                }else{
                    stack.pop();
                    stack.push(arr[i]);
                    res[k++]=-1;
                }
            }
        }
        for (Integer i : res) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        int arr[]={5 , 3 , 5,7,1};
        smallest(arr);  
    }
}

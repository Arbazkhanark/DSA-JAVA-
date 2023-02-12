package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.Stack;

public class MaxAreaHistogram_STACK {
    public static int[] previous_Smallest(int arr[]){
        int ps[]=new int[arr.length];
        Stack<Integer> stack =new Stack<>();

        for(int i=0;i<arr.length;i++){
            // int prev=stack.peek();
            int curr=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=stack.peek();
            }
            stack.push(i);
        }
    return ps;
    }

    public static int[] nextSmall(int arr[]){
        int ns[]=new int[arr.length];
        Stack<Integer> stack =new Stack<>();

        for(int i=arr.length-1;i>=0;i--){

            int curr=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=curr){
                stack.pop();
            }
            if(stack.isEmpty()){
                ns[i]=-1;
            }else{
                ns[i]=stack.peek();
            }
            stack.push(i);
        }
    return ns;
    }

    public static int maxAreaHistogram(int arr[]){
        int ps[]=previous_Smallest(arr);
        int ns[]=nextSmall(arr);

        int max=0;
        for(int i=0;i<arr.length;i++){
            int width=ns[i]-ps[i]-1;
            int currArea=width*arr[i];
            max=Math.max(max, currArea);
        }
        return max;
    }

    public static void main(String[] args) {
        // int arr[]={4,3,9,2,5,1,8,3};
        int arr[]={6, 2, 5, 4, 5, 1, 6};
        System.out.println(maxAreaHistogram(arr));
    }
}

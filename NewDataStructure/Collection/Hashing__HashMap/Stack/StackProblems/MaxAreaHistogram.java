package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int arr[]={7,3,6,5,6,2,7};

        int max=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int left=i;
            int right=i;

            while(left>=0 && arr[left]>=arr[i])left--;
            while(right<n && arr[right]>=arr[i])right++;

            int width=right-left-1;

            int areaOfHistogram=width*arr[i];
            if(areaOfHistogram>=max)max=areaOfHistogram;

        }

        System.out.println(max);
    }
}


class AreaOfMaximumHistogram{

    public static void previous_Smallest(int arr[]){
        int ps[]=new int[arr.length];
        Stack<Integer> stack =new Stack<>();

        // int k=-1;
        int k=0;
        for(int i=0;i<arr.length;i++){
           int prev=stack.peek();
            if(stack.isEmpty()){
                stack.push(-1);
                ps[k++]=-1;
            }else if(arr[i]>arr[prev]){
                s
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,5,7,1};
    }
}
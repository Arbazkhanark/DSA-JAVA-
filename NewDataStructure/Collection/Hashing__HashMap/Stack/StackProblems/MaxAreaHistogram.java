package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        // int arr[]={7,3,6,5,6,2,7};
        int arr[]={4,3,9,2,5,1,8,3};

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
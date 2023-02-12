package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.Stack;

// Maximum Area of Sub-Matric in Matrix with all 1.
public class MaxArea_Submatric_in_Matrix {

    public static int[] Previous_Smallest(int arr[]){
        int prev_Smallest[]=new int[arr.length];
        Stack<Integer> stack =new Stack<>();

        // int k=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!stack.isEmpty() && arr[stack.peek()]>=curr){
                stack.pop();
            }

            if(stack.isEmpty()){
                prev_Smallest[i]=-1;
            }else{
                prev_Smallest[i]=stack.peek();
            }
            stack.push(i);
        }
        return prev_Smallest;

    }

    public static int[] next_Smallest(int arr[]){
        int nextSmall[]=new int[arr.length];
        Stack<Integer> stack =new Stack<>();

        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];

            while(!stack.isEmpty() && arr[stack.peek()]>=curr){
                stack.pop();
            }

            if(stack.isEmpty()){
                nextSmall[i]=-1;
            }else{
                nextSmall[i]=stack.peek();
            }
            stack.push(i);
        }
        return nextSmall;
    }

    public static int max_Area_Histogram(int arr[]){
        int prev_Smallest[]=Previous_Smallest(arr);
        int next_Smallest[]=next_Smallest(arr);

        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int width=next_Smallest[i]-prev_Smallest[i]-1;
            int Area=width*arr[i];
            maxArea=Math.max(maxArea, Area);
        }
        return maxArea;
    }

    public static int maxArea_SubMatric(int arr1[][]){
        int subMatric[]=new int[arr1[0].length];
        int max=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<subMatric.length;j++){
                if(arr1[i][j]==0){
                    subMatric[j]=0;
                }else{
                    subMatric[j]++;
                }
            }
            int curr=max_Area_Histogram(subMatric);
            max=Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr1[][]={{1,1,0,1},
                      {1,1,1,1},
                      {1,1,1,1},
                      {1,1,1,0}};

        System.out.println(maxArea_SubMatric(arr1));
        // int arr[]={6, 2, 5, 4, 5, 1, 6};
        // int arr[]={4,3,9,2,5,1,8,3};
    }
}

package NewDataStructure.Collection.Hashing__HashMap.Queue.QueueProblems;

public class Sliding_Max_Window {
    public static void main(String[] args) {
        int arr[]={2,5,4,7,1,8,2};
        // int arr[]={5,-1,0,9,-4,7,1};
        int k=3;
        int window=k-1;
        int ans[] =new int[arr.length];
        int max=arr[0];
        for(int i=0;i<arr.length-window;i++){
            for(int j=i;j<i+k;j++){
                if(arr[j]>=max){
                    max=arr[j];
                }
            }
            ans[i]=max;
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }
}




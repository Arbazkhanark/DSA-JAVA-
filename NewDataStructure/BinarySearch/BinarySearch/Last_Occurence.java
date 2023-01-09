package BinarySearch;
import java.util.Scanner;

public class Last_Occurence {
    
    public static int right_Occurence(int arr[],int start,int end,int key){
        int res=-1;    
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                res=mid;
                end=mid+1;
            }
            if(key<arr[mid])end=mid-1;
            else start=mid+1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,4,4,4,6,6,6,6,7,8,9,9,9,12,12,14,17,17};
        int start=0;
        int end=arr.length-1;
        
        System.out.println("Enter Key for Search: ");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        int res=right_Occurence(arr, start, end, key);
        System.out.println("Your Index of Last Occrence: "+res);

    }
}

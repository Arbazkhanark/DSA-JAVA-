package NewDataStructure.BinarySearch;
import java.util.Arrays;

class AggressiveCowsBinaySearch{

    public static Boolean isPossiable(int arr[],int totalCow,int mid){
        int cows=1;
        int lastPosition=arr[0];
        
        for(int i=0;i<arr.length;i++){

            if(mid<=(arr[i]-lastPosition)){
                cows++;
                lastPosition=arr[i];
                    if(cows==totalCow){
                        return true;
                    }
            }
        } 

        return false;
    }
    public static void main(String[] args) {
        // int arr[]={10 ,1 ,2 ,7 ,5};
        // int arr[]={31, 27, 8, 33, 32, 20, 7, 24, 23, 3, 26, 9};
        int arr[]={2, 36, 4, 23, 24, 12, 38, 33, 8, 5, 1};
        

        Arrays.sort(arr);
        int totalCow=10;
        int start=0;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>end){
                end=arr[i];
            }
        }

        int res=-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(isPossiable(arr, totalCow, mid)){
                res=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(res);
    }
}












///////  Without BinarySearch
public class AggressiveCows {

    public static Boolean isPossible(int arr[],int start,int totalCow,int stalPosition){
        int cow=1;
        int previousPosition=arr[0];


        for(int currentPosition=1;currentPosition<arr.length;currentPosition++){
            int current=arr[currentPosition];
            
                if(start<=current-previousPosition){
                    previousPosition=current;
                    cow++;
            }
            
        }
        if(cow<totalCow ){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // int arr[]={1,2,4,8,9};
        int arr[]={10 ,1 ,2 ,7 ,5};  // Without Sort res =-1

        Arrays.sort(arr);
        int totalCow=3;
        int stalPosition=5;

        int start=1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>end){
                end=arr[i];
            }
        }

        int res=-1;
        while(start<=end){
            // int mid=(start+end)/2;
            if(isPossible(arr, start, totalCow, stalPosition)){
                res=start;
                // res=mid;
                // start=mid+1;
            }else{
                // end=mid-1;
                break;
            }
            start++;
        }
    System.out.println(res);
    }
}



















class Solution {
    
    
    public static Boolean isPossible(int arr[],int start,int totalCow){
        int cow=1;
        int previousPosition=arr[0];


    /////////   Tracking the Current Position   
        for(int currentPosition=1;currentPosition<arr.length;currentPosition++){
            int current=arr[currentPosition];
            
            ////// Positioning Cows in stalls(Walls).....
            // if Start is less or Equal to (current-previousPosition)
                if(start<=current-previousPosition){
                    previousPosition=current;
                    cow++;
            }
            
        }
        //// If cow is greaterthan Or EqualTo Total Cows than return true
        if(cow>=totalCow){
            return true;
        }

        return false;
    }
    
    
    ///////////////////////  Implementing Without Binary Search      /////////////////////////////////
    public static int solve(int n, int totalCow, int[] arr) {

    //// an Array Sort 
        Arrays.sort(arr);

        
        int start=1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>end){
                end=arr[i];
            }
        }

        int res=-1;
        while(start<=end){
        
        ///// Checking if Position is posible
            if(isPossible(arr, start, totalCow)){
                res=start;
            }else{
            
                break;
            }
            start++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5,7,2,9,21,2};
        int totalCow=3;
        int n=arr.length;
        System.out.println(solve(n, totalCow, arr));
    }

}
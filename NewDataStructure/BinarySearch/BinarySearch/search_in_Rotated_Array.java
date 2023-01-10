package NewDataStructure.BinarySearch.BinarySearch;
public class search_in_Rotated_Array {

    public static int search(int arr[], int key){
        int start=0;
        int end=arr.length;
        
        // if(start>end)return -1;
        
        while(start<=end){
            int mid=start+(end-start)/2;

        //Mid    
            if(arr[mid]==key){
                return mid;
            }

    // Left Side
            if(arr[mid]>arr[start]){
                if(arr[start]<=key && arr[mid]>key){
                    end=mid-1;
                }else{
                    start=mid;
                }
            
            
            }
    // Right Side
            else{
                if(arr[end]>key && arr[mid]<key){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return -1;
}
    public static void main(String args[]){
        // int arr[]={20,30,40,50,60,5,10};
        int arr[]={1,3,4,5,6,7,8,9,10};
        int key=10;                          // last element is not working properly
        int res=search(arr,key);
        System.out.println(res);
    }
}

package NewDataStructure.BinarySearch.BinarySearch;
public class search_in_Rotated_Array {

    public static int search(int arr[], int key){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }

    // Left Side
            if(arr[mid]<arr[start]){
                if(arr[start]>key && key<arr[mid]){
                    end=mid-1;
                }
            }else{
                if(arr[mid]<key){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={20,30,40,50,60,5,10};
        int res=search(arr, 0);
        System.out.println(res);
    }
}

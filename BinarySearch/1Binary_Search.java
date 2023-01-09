package BinarySearch;

class Binary{

    public static int search(int arr[], int start, int end, int key){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }   
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,4,7,8,11,15};
        int key=15;
        int start=0;
        int end=arr.length;
        int res=search(arr, start, end, key);
        System.out.println(res);
    }
}
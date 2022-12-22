package BinarySearch;

class BinarySearch{
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int key=9;
        int first=arr[0];
        int last=arr[arr.length-1];
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.println("Your Search Element is at: "+mid+" Index");
                break;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("No Search:!!");
        }
    }
}
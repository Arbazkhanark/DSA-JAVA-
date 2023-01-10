package NewDataStructure.BinarySearch.BinarySearch;

class First_Occurence{

    public static int first_Occurence(int arr[],int start,int end,int key){
        int res=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                res=mid;
                end=mid-1;
            }
            if(key>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,6,7,7,7,8,8,8,8,8,8,8,11,11,11,11,11,13,15,17,17,17,18};
        int key=11;
        int start=0;
        int end=arr.length;
        int res=first_Occurence(arr, start, end, key);
        System.out.println("Your Index of First Occrence: "+res);
    }
}
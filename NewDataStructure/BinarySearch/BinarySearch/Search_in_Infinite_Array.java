package NewDataStructure.BinarySearch.BinarySearch;

//The Array is Sorted here....
class Search_in_Infinite_Array{
    public static int searchInfinite(int arr[],int key){
        int start=0;
        int range=1;
        while(start<=key){
            if(arr[start]==key){
                return start;
            }
            if(arr[start]>key){
                return -1;
            }else{
                range*=2;
                if(arr[range]==key){
                    return range;
                }
                if(arr[range]<key){
                    start=range;
                }else{
                    while(start<=range){
                        int mid=(start+range)/2;
                        if(arr[mid]==key){
                            return mid;
                        }
                        if(arr[mid]<key){
                            start=mid+1;
                        }else{
                            range=mid-1;
                        }
                    }
                }  
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,11,13,14,17,17,19,23,25,27,28,29,31,34,35,36};
        int key=28;
        int res=searchInfinite(arr, key);
        System.out.println(res);
    }
}
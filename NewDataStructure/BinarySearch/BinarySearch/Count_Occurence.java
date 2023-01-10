package NewDataStructure.BinarySearch.BinarySearch;

class Count{

    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};

    }

    //First Occurence
    public static int first(int[] nums, int target){
        int start=0;
        int end=nums.length-1;

        int firstOccurence=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                firstOccurence=mid;
                end=mid-1;
            }
            if(target<=nums[mid]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return firstOccurence;
    }


    //Last Occurence
    public static int last(int nums[],int key){
        int start=0;
        int end=nums.length;
        
        int lastOccurence=-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]==key){
                lastOccurence=mid;
                end=mid+1;
            }
            if(key < nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return lastOccurence;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,4,4,5,7,7,7,7,7,8,9};
        int key=7;
        //Error there......
        int res=searchRange(arr,key);
    }
}
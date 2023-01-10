package NewDataStructure.BinarySearch.BinarySearch;

class Count{

    // public int[] searchRange(int[] nums, int target) {
    //     return new int[]{first(nums, target), last(nums, target)};

    // }

    //First Occurence
    public static int first(int[] nums, int target){
        int start=0;
        int end=nums.length;

        int firstOccurence=-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                firstOccurence=mid;
                end=mid-1;
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
        int res[]=new int[2];

        res[0]=first(arr, key);
        res[1]=last(arr, key);

        for (int i : res) {
            System.out.println(i);
        }

        int Count=0;
        // Count=(res[1]-res[0])+1;
        Count=(last(arr, key)-first(arr, key))+1;
        System.out.println("The Total Occurences are: "+Count);
    }
}
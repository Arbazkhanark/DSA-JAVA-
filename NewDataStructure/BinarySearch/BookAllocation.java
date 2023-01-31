package NewDataStructure.BinarySearch;


public class BookAllocation {

    public static Boolean isPossible(int arr[],int total_Students, int numberOfBooks,int mid){
        int student=1;
        int sumPage=0;

        for(int i=0;i<arr.length;i++){
            if(sumPage+arr[i]<=mid){            /// 13 ,31 ,37 ,45 ,46 ,54 ,55 ,63 ,73, 84 ,85
                sumPage+=arr[i];
            }else{                                   
                student++;                             
                // sumPage=0;
                if(student>total_Students || arr[i]>mid){
                    return false;
                }
                sumPage=arr[i];
            }
        }
        return true;
    }


    public static int findMinimum(int arr[],int numberOfBooks ,int total_Students){
        if(numberOfBooks<total_Students){
            return -1;
        }


        int end=0;
        for(int i=0;i<arr.length;i++){
            end+=arr[i];
        }
        
        int start=0;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr, total_Students, numberOfBooks,mid) ){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            // mid=start+(end-start)/2;
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[]={13 ,31 ,37 ,45 ,46 ,54 ,55 ,63 ,73, 84 ,85};
        // int arr[]={12 ,34 ,67 ,90};
        // int arr[]={22 ,23 ,67};
        int numberOfBooks=11;
        int total_Students=1;

        System.out.println(findMinimum(arr, numberOfBooks, total_Students));
}
}

package NewDataStructure.BinarySearch.BinarySearch;

public class Binary_Rough {
    public static void main(String[] args) {
        
        int arr[]={1,2,6,9,12,14,16,17,18,18,19,21};
        int key=14;

        int start=0;
        int range=1;
        int end =0;
        while(arr[start]<=key){
            if(arr[start]==key){
                System.out.println(start);
            }

            if(arr[start]>key){
                System.out.println(-1);
            }else{
                if(arr[range]<key){
                    start=range+1;
                }else{
                    end=range-1;
                }
            }


            }
        }
       
       
       
       
       
       
       
       
       
       
        // for(int i=0;i<6;i++){
        //     range*=2;
        //     System.out.println(range);
        // }


        


}


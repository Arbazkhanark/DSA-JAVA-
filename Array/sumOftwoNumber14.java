// Find Two Numbers in a sorted Array with the Given Sum.

class SumOftwoNumber14 {
    public static void main(String[] args) {
        int arr[]={1,2,7,8,10,12};
        int key=10;
        int left=0;
        int right=arr.length-1;

        // boolean flag=false;
        // for (int i=0;i<arr.length-1;i++){
        //     for (int j=i+1;j<arr.length;j++){
        //         if (arr[i]+arr[j]==key){
        //             System.out.println(arr[i]+" + " +arr[j]+" ="+key);
        //             flag=true;
        //         }
        //     }
        // }
        // if(flag==false){
        //     System.out.println("Not Found :(");
        // }else{
        //     System.out.println(flag);
        // }








        // for(int i=left;i<=right;i++){
        //     if(current_sum<key){
        //         left++;
        //     }else if(current_sum>key){
        //         right--;
        //     }else{
        //         System.out.println("true");
        //         System.out.println(arr[left]+" "+arr[right]);
        //     }
        // }



        while(left<right){

            if(arr[left]+arr[right]==key){
                System.out.println(arr[left]+" "+arr[right]);

            }

            if(arr[left]+arr[right] < key){
                left++;
            }else{
                right--;
                System.out.println("true");
            }
            
        }
    }
}
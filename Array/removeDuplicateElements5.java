// Remove duplicate elements from an Array.

class RemoveDuplicateElements{

    public static void main(String[] args){

        int arr[]={1,2,2,4,4,4,5,7,7,7,8};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }

        for(int arbaz:arr){
            System.out.println(arbaz);
        }
    }
}
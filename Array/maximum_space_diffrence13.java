// Given an Array arr[], find the maximum j-i such that   arr[j] > arr[i].

class Maximumdiffrence{
    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>0;j--){
                if(arr[j]>arr[i] && max<(j-i)){
                    max=j-i;
                }
            }
        }
        System.out.println(max);
    }
}
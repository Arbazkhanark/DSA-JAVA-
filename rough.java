class Heyyyy{

    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,1,3,2,1,2,1};
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int k=0;
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int n=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            left[k++]=max;
            System.out.println(left[i]);
        }

        System.out.println("----------------------------------------");
        int x=right.length-1;
        for(int j=n;j>0;j--){
            if(arr[j]>max1){
                max1=arr[j];
            }
            right[x--]=max1;
            System.out.println(right[j]);
        }


        
    }
}
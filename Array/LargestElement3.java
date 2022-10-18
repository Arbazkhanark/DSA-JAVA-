//Find the Largest Element from an array.

class LargestElement3{

    public static int largest(int a[]){

        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[max]){
                a[max]=a[i];
            }
        }
        return a[max];
    }

    public static void main(String[] args){
        int arr[]={2,4,7,12,101,9,5,3,100};
        System.out.println(largest(arr));
    }
}
package SortingAlgo;

class Quick{
    public static int partition(int arr[], int low ,int high){
            int pivot=arr[high];

            int i=low-1;

            for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    i++;

                    //SWAP
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            i++;
            int temp2=arr[i];
            arr[i]=pivot;
            arr[high]=temp2;
            return i;        /////  pivot Index
    }

    // It Divides the Array
    public static void quickSort(int arr[], int low , int high){
        
        if(low<high){
            int pIndex=partition(arr, low, high);

            //It divides the Arrays
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }


    public static void main(String[] args) {
        int arr[]={4,2,6,8,9,7,3};
        int n=arr.length;
        quickSort(arr, 0, n-1);


        for (int i : arr) {
            System.out.println(i);
        }
    }
}
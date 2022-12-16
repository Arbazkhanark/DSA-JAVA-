package SortingAlgo;



// The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part

class SelectionSort{

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,10,9,9,2,0,6,3,1,3};

        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
            System.out.println(arr[i]);
        }

    }
}
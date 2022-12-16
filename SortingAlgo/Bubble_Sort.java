package SortingAlgo;


//This code can Sort the elements but it is not a Bubble-Sort!!

/*
class Sort{
    public static void main(String[] args) {
        int arr[]={5,10,9,9,2,6,3,1,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
    }

}
}
 */




//Real Bubble-Sort  (repeatedly swapping the adjacent elements if they are in the wrong order.)
class BubbleSortExample {  

        public static void printArr(int a[]){
                for(int i=0;i<a.length;i++){
                        System.out.println(a[i]);
                }
        }
    public static void swap(int arr[]){
        for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                        if(arr[j]>arr[j+1]){
                                int temp=arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                        }     
                }
        }
        printArr(arr);
    }
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                swap(arr);
   
        }  
} 
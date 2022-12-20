package SortingAlgo;

//     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     //
//This code can Sort the elements but it is not a Insertion-Sort!!
class Insertion{
    public static void main(String[] args){
        // int arr[]={7,8,3,5,9,2,4,1};
        int arr[]={7,3,7,4,9,12,2,34};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int min=i;
                if(arr[min]>arr[j]){
                    min=j;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}





//This code can Sort the elements but it is a Insertion-Sort!!

/*
The array is virtually split into a sorted and an unsorted part. 
Values from the unsorted part are picked and placed at the correct position in the sorted part.
 */


class InsertionSort{
    public static void main(String[] args) {
        int arr[]={7,3,7,4,9,12,2,34};

        for(int i=0;i<arr.length;i++){    // i : Maintain UnSorted part
            int current=arr[i];
            int j=i-1;                    // j : Maintain Sorted part
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //Placement
            arr[j+1]=current;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
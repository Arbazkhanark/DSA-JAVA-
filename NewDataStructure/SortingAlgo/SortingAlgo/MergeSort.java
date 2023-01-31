package SortingAlgo;

class Merge{ 
    public static void conqure(int arr[], int start, int mid, int end){
        // We need new array for insert all the divided arrays: elements also should be in sorted way. 
       int merged[]=new int[end -start+1];

       int index1=start;   // It tracks the first array
       int index2=mid+1;   // It tracks the second array
       

       // This loop Sort the elements of array and Add to the merged array. 
       int x=0;
       while(index1 <= mid   &&   index2 <= end){
            if(arr[index1] <= arr[index2]){
                merged[x]=arr[index1];
                x++; index1++;
            }else{
                merged[x]=arr[index2];
                x++; index2++;
            }
       }

       // These both while loop below will help us to Add the elements which is left from arr.
       //Only One loop will run ::::: if or if
       while(index1 <=mid){
            merged[x]=arr[index1];
            x++;
            index1++;
       }
       while(index2 <=end){
            merged[x]=arr[index2];
            x++;
            index2++;
       }

       
       // Copy of merged array's element and Add in Original Array(arr[]).
       for(int i=0,j=start;i<merged.length;i++,j++){
            arr[j]=merged[i];
       }



    }
    
    public static void divide(int arr[],int start, int end){
        if(start<end){
            int mid=(start+end)/2;

            //Recurssion
            divide(arr, start, mid);
            divide(arr, mid+1, end);

            //Now we conqure the divided array
            conqure(arr, start, mid, end);
        }
    }


    public static void main(String[] args) {
        int arr[]={3,2,7,5,9,1,7,5,4,0};
        int n =arr.length;

        divide(arr, 0, n-1);

        ////Print 
        for (int i : arr) {
            System.out.println(i);
        }
    }
}



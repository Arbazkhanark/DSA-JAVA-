public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,2,4,8};

        int res[]=new int[arr1.length+arr2.length];
        int k=0; 
        int i=0,j=0;
        while(i<arr1.length &&j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k++]=arr1[i++];
            }else{
                res[k++]=arr2[j++];
            }
        }
        while(j<arr2.length){
            res[k++]=arr2[j++];
        }
        while(i<arr1.length){
            res[k++]=arr1[i++];
        }

        for (int x : res) {
            System.out.print(x);
        }
    }
}



class MergeSecondWay{
    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9,11,12,15,17};
        int arr2[]={2,2,4,8};
        
        int res[]=new int[arr1.length+arr2.length];
        int k=arr1.length+arr2.length-1;
        int i=arr1.length-1,j=arr2.length-1;

        //Arrange Sorted Array and merge...
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                res[k--]=arr1[i--];
            }else{
                res[k--]=arr2[j--];
            }
        }

        //Printing Array
        for (int x : res) {
            System.out.println(x);
        }
    }
}
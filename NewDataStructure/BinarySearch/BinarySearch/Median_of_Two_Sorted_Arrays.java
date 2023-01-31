package NewDataStructure.BinarySearch.BinarySearch;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int arr1[]={11,13,13,14};
        int arr2[]={2,2,4,11,12};
        int start=0;
        int res[]=new int[(arr1.length)+(arr2.length)];  //{1,2,2,3,4,5}
        int end=res.length;


        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];
        }

        for(int j=0;j<arr2.length;j++){
            res[arr1.length+j]=arr2[j];
        }
        Arrays.sort(res);


        if(end%2==0){
        int temp=0;
        for(int i=0;i<res.length;i++){
            temp+=res[i];
            }
        temp/=end;
        System.out.println(temp);
        }else{
            int mid=(start+end)/2;
            System.out.println(res[mid]);

        }
    }
}


class MergeMedian{
    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2,7};

        int res[]=new int[arr1.length+arr2.length];
        int k=arr1.length+arr2.length-1;

        int i=arr1.length-1;
        int j=arr2.length-1;

        int start=0;
        int end=res.length;

        
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                res[k--]=arr1[i--];
            }else{
                res[k--]=arr2[j--];
                
            }
        }
        while(i>=0){
            res[k--]=arr1[i--];
        }
        while(j>=0){
            res[k--]=arr2[j--];
        }

        for (int l : res) {
            System.out.println(l);
        }

        double median=0;
        if(end%2==0){
            
            for(int x=0;x<end;x++){
                median+=res[x];
            }
            median/=end;
            System.out.println("Median: "+median);
        }else{
            median=(start+end)/2;
            System.out.println("Median: "+res[(int)median]);
        }

    }
}

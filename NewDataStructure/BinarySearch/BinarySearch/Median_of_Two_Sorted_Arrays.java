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

        
        // for (int i : res) {
        //     System.out.println(i);
        // }
    }
}

//Find if there is subArray with sum Zero(0).

import java.util.HashSet;
import java.util.Set;
class SumZero{
    public static void main(String[] args) {
        int arr[]={2,3,1,-4,3,-2};
        // int a[]=new int[arr.length];  //2,5,6,2,5,3
        boolean isTrue=false;
        Set<Integer> b=new HashSet<>();
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // a[n++]=sum;
            // System.out.println(a[i]);
            if(b.contains(sum)){
                isTrue=true;
            }
            b.add(sum);
        }
        if(isTrue){
            System.out.println("True,  There is Zero in SubArray  :)");
        }else{
            System.out.println("False,  There is NOOO Zero in SubArray  :(");
        }
    }
}
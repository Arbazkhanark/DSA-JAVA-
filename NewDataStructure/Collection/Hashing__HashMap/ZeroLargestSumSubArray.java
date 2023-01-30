package NewDataStructure.Collection.Hashing__HashMap;
import java.util.HashMap;


public class ZeroLargestSumSubArray {

    public static int largestZeroSumSubArray(int Cummulative[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,-1);
        int ans=0;
        for (int i=0;i<Cummulative.length;i++) {
            
            if(map.containsKey(Cummulative[i])){
                int prev=map.get(Cummulative[i]);
                ans=Math.max(ans, i-prev);         //4,4,1,10
            }else{
                map.put(Cummulative[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,-1,2,4,-5,-1,-9,0,7};
        int CummulativeSum[]=new int[arr.length];  // 1,3,2,4,8,3,2,-7,-7,0
     
        int sum=0;
       for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            CummulativeSum[i]=sum;
        }
     
        System.out.println(largestZeroSumSubArray(CummulativeSum));
        // largestZeroSumSubArray(CummulativeSum);
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////
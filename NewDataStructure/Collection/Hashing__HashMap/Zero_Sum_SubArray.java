package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashSet;

class Zero_Sum_SubArray{

        public static Boolean zeroSum(int sum[]){
            HashSet<Integer> set= new HashSet<>();
            
            for (Integer i : sum) {
                if(set.contains(i)){
                    return true;
                }
                set.add(i);
            }

            return false;
        }

    public static void main(String[] args) {
        int arr[]={1, 4, -3, 2, 1, 2};
        int CummulativeSum[]=new int[arr.length];

        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                CummulativeSum[i]=sum;
        }

        System.out.println(zeroSum(CummulativeSum));
    }
}
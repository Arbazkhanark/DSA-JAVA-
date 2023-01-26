package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashMap;
import java.util.HashSet;

//// Pair with given sum in an Unsorted Array. (Using HashMap)
public class PairSumArray {
    public static Boolean sum(int arr[], int add) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i : arr) {
            int temp=add-i;
            if(map.containsKey(temp)){
                return true;
            }
            map.put(i, null);
        }
        return false;
    }


    public static void main(String[] args) {          //// 10=NO pair
        int arr[]={1,2,3,1,4,5,2,-1,4};               ////  8= 5 & 3; Two Pair Only
        int sum=10;
        System.out.println(sum(arr, sum));
    }
}


//// Pair with given sum in an Unsorted Array.(Using HashSet)
class PairSumUsingSet{

    public static Boolean add(int arr[],int sum){
        HashSet<Integer> set = new HashSet<>();
        
        for (Integer i : arr) {
            int temp=sum-i;
            if(set.contains(temp)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int arr[]={1,2,3,1,4,5,2,-1,4};
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum=16;
        System.out.println(add(arr, sum));
    }
}
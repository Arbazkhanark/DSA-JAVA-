package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {
    
    // public static Set<Integer> count(int arr[]){
    public static int count(int arr[]){
        HashSet<Integer> set=new HashSet<>();

        for (Integer x : arr) {
            set.add(x);
        }
        return set.size();
    }


    public static void main(String[] args) {
        int arr[]={1,2,6,1,3,4,3,4,4,4,4};
        System.out.println(count(arr));

    }
}

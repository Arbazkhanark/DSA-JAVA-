package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutive(int arr[]){
        HashSet<Integer> set=new HashSet<>();

        for (Integer i : arr) set.add(i);
        
        int count=0;
        int ans=0;
        for (Integer i : set) {
           int min=i-1;
            if(set.contains(min)){    
            }else{
                if(set.contains(i)){
                    count=1;
                    while(set.contains(++i)){
                        count++;
                    }
                    ans=Math.max(ans, count);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={2,1,9,3,5,4,8,7,2,1,3};
        System.out.println(longestConsecutive(arr));
    }
}

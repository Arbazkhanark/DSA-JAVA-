// Generate All subsets/Subsequence of a string.

package recursion_And_Backtracking;

import java.util.HashSet;
import java.util.Set;
class SubsetString{

    public static void subset(String st){
        Set<String> set=new HashSet<String>();
        sub("",0,st,set);
        for(String ark:set){
            System.out.println(ark);
        }
      

    }
    public static void sub(String s, int index, String st, Set<String> set){
        if(index==st.length()){
            // System.out.println(s);
            set.add(s);
            return;
        }
        

        
        sub(s, index+1, st,set);
        sub(s+st.charAt(index), index+1,st,set);
        
        // System.out.println(set.add(s));
        
    }
    public static void main(String[] args) {
        String str="AAA";
        subset(str);
        

    }
}
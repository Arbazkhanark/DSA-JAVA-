// Generate All subsets/Subsequence of a string.

package recursion_And_Backtracking;

// import java.util.HashSet;
// import java.util.Set;
class SubsetString{

    public static void subset(String st){
        
        sub("",0,st);
      

    }
    public static void sub(String s, int index, String st){
        if(index==st.length()){
            System.out.println(s);
            return;
        }
        

        
        sub(s, index+1, st);
        sub(s+st.charAt(index), index+1,st);
        
        // System.out.println(set.add(s));
        
    }
    public static void main(String[] args) {
        String str="AAA";
        subset(str);
        

    }
}
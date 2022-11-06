package String;

import java.util.Arrays;

class Anagram{
    public static boolean anagramCheck(String first ,String second){
        boolean isTrue=false;
        if(first.length()!=second.length()){
            return isTrue;
        }else {
            char ch1[]=first.toLowerCase().toCharArray();
            char ch2[]=second.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        String s1="Race";
        String s2="care";
        System.out.println(anagramCheck(s1,s2));
    }
}
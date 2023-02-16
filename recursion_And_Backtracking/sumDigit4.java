// Find the sum of digits in a Number using Recursion.

package recursion_And_Backtracking;

class SumDigit{

    public static int sum(int a){
        if(a<=10) return a;
        return a%10+(sum(a/10)); 
    }

    public static void main(String[] args) {
      
        int n=12345;
        System.out.println(sum(n));
        
        
        // int temp=0;
        // while(n>0){ 
        //     int x=n%10;
        //     temp+=x;
        //     n=n/10;
        // }
        // System.out.println(temp);
        
    }
}
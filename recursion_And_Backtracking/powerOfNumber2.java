// Find the Power of a Number using Recursion.

package recursion_And_Backtracking;

class Power{
    
    public static int findPower(int exponent, int power){
        if(power==0) return 1;
    
       return exponent*(findPower(exponent,(power-1)));
    //   return (int) Math.pow(exponent, power);
    }

    public static void main(String[] args) {
        
        System.out.println(findPower(5,2));
    }
}
// How many Zeroes in factorial in last digits.

package math;

class Trailing_Zeroes_factorial{
    public static void main(String[] args) {
        long n=50;
        long x=n;
        long fact=1;
        long count=0;
        for(long i=n;i>0;i--){
            fact*=i;
            x=x/5;
            count+=x;
        }
        System.out.println("Factorial: "+fact);

        System.out.println("Trailing Zeroes: "+count);
    }
}
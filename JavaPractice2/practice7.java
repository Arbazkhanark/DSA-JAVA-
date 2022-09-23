// 7.Write a java method to print Fibonacci series of n terms where n is argument passed by user.

package JavaPractice2;

class Fibonacci{

    public static void fibb(int n){
        int fib=0;
        for (int i=1;i<=n;i++){
            fib=fib+i;
        }
        System.out.println("Fibonacci: "+fib);
    }
    
    public static void main(String[] args){
        int n=10;
        fibb(n);
    }
}
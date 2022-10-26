
package math;

import java.util.Arrays;

class Sieve_of_eratosthenes{

    public static boolean[] prime(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        int n=100;

        boolean[] isPrime=prime(n);
        for(int i=0;i<=n;i++){
            if(isPrime[i]==true){
                System.out.println(i+" "+isPrime[i]);
            }
        }
    }
}
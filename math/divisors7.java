
package math;

class Divisors{
    public static void main(String[] args) {
        int n=30;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);               //     1        ,   5
                if(n/i!=i) System.out.println(n/i);  //     25/1=25  ,  25/5=5
            }
        }

        System.out.println();
        System.out.println("Sorted :::::");
        System.out.println();

        int i=1;
        for(i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);   
            }
        }
        i--;
        for(;i>=1;i--){
            if(n%i==0){ 
                if(n/i!=i)System.out.println(n/i);
            }
        }
    }
}
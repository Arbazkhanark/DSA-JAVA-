
package math;

class Prime{
    public static
     void main(String[] args) {
        int n=9;
        boolean isPrime=true;
        if(n<=1){
            System.out.println("Not a prime number");
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }


    }
}







///////////////////////////////   SECOND METHOD   //////////////////////////////


// package math;

class SecondMethodPrime{
    public static void main(String[] args) {
        int n=101;
        int count=0;

        
        if(n==0 || n==1){
            count++;
        }
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
            if(count==0){
                System.out.println("Prime");
            }else{
                System.out.println("Not a Prime");
            }
        
    }
}
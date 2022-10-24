
package math;

class Lcm{
    public static void main(String[] args) {
        int a=35;
        int b=50;
        int temp=1;
        int gcd=0;

        if(a>b){
            temp=a;
        }else{
            temp=b;
        }
        for(int i=1;i<temp;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            } 
        }
        System.out.println((a*b)/gcd);
    }
}
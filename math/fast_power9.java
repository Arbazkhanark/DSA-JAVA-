// How to calculate FAST POWER

package math;

class FastPow{
 
    public static int power(int e,int p){

        if(p==0)return 1;
        if(p==1)return e;
        
        int half=power(e,p/2);
        int full=half*(power(e, p/2));   //// full= half*half;
        if(p%2!=0){
            return full*e;
        }else{
            return full;
        }
    }
 
    public static void main(String[] args) {
        int exponant=2;
        int pow=3;

        System.out.println(power(exponant, pow));







///////////////////////////////////////        EXPONANT AND POWER  -1            /////////////////////////////////////////////////        

        exponant=3;
        pow=4;
        int temp=exponant;
        for(int i=1;i<pow;i++){                                // Loop is not complete here   :(
            exponant*=temp;
        }
        System.out.println(exponant);

        

///////////////////////////////////////////     EXPONANT AND POWER -2      ///////////////////////////////////////////////////////
        
        exponant=2;
        pow=5;
        int temp1=exponant;
        for(int i=1;i<=pow;i++){                             //Loop is Complete Here  :)
            if(i==1){
                exponant=exponant;
            }else{
                exponant*=temp1;
            }
        }
        System.out.println(exponant);
    }
}
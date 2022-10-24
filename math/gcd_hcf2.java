// GCD or HCF of Two Numbers.

package math;

class GCD{

    public static void main(String[] args) {
        int a=81;
        int b=-153;
        int temp=1;

        if(a<=b){
            temp=a;
        }else{
            temp=b;
        }
        for(int i=temp;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            } 


//         if(a<b){
//             for(int i=a;i>0;i--){
//                 if(a%i==0 && b%i==0){
//                     System.out.println(i);
//                     break;
//                 }   
//             }
//         }else if(a>b){
//             for(int i=b;i>0;i--){
//                 if(a%i==0 && b%i==0){
//                     System.out.println(i);
//                     break;
//         }
//     }
// }
    }
}
}
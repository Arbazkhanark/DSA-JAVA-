// 6.Write a java method to find the Smallest number among three numbers.

package JavaPractice2;


class Method{

    public static void smallest(int a,int b,int c){


        if(a<b && a<c){
            System.out.println("A is smallest: "+a);
        }else if(b<a && b<c){
            System.out.println("B is smallest: "+b);
        }else {
            System.out.println("C is smallest: "+c);
        }
    }
    public static void main(String[] args){

        int a=5;
        int b=12;
        int c=2;

        smallest(a,b,c);


    }
}
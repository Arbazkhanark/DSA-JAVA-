class Shift{

    public static void main(String[] args){
        int a=50;
        int b=a << 2; //This is left shift it means {  b= 50*2^n   (n=2)  }
        System.out.println("Left Shift: "+b);

        int c=a >> 2; //This is Right shift  {  c= 50/2^n     (n=2)  }
        System.out.println("Right Shift: "+ c);
    }
}
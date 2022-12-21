class Fibonacci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int res;
        int n=9;
        System.out.println(a+"\n"+b);
        for(int i=1;i<n;i++){
            res=a+b;
            a=b;
            b=res;
            System.out.println(res);
        }
    }
}






class Fibonaaacci {
    public static int fib(int n) {
        if (n <= 1)  // If n is less than 1 or equal to 1 than return that value
            return n;
        return fib(n - 1) + fib(n - 2);  //Recursion and decrease the n recursively
    }
    public static void main(String[] args) {
        int res=fib(9);
        System.out.println(res);
    }
}





//// Recursion
class Fibbonaci {
    public static int fib(int n) {
        if (n <= 1)  // If n is less than 1 or equal to 1 than return that value
            return n;
        return fib(n - 1) + fib(n - 2);  //Recursion and decrease the n recursively
    }
    public static void main(String[] args) {
        int res=fib(9);
        System.out.println(res);
    }
}

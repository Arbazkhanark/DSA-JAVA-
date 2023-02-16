// print 1 to 5 And  (5 to 1).

package recursion_And_Backtracking;

class Basic{

// Print 5 to 1 natural numbers.    
    public static int printInverseNaturalNumber(int n){
        if(n==1) return n;
        
        System.out.println(n);
        return printInverseNaturalNumber(n-1);
    }
    

// Print  1 to 5 natual numbers.    
    public static int printNaturalNumber(int i){
        if(i==5) return i;

        System.out.println(i);
        return printNaturalNumber(i+1);
    }


    public static void main(String[] args) {
        
        System.out.println(printInverseNaturalNumber(5));
        System.out.println();
        // System.out.println(printNaturalNumber(1));

    }
}
package NewDataStructure.BinarySearch;


////// Using Binary Search
class SquareRootBinarySearch {
    public static int mySqrt(int x) {
        
        int start=1;
        int end=x;

// Find Square Root of x using => Binary Search
        while(start<=end){
            int mid=(start+end)/2;
            if( mid<=(x/mid) ) start=mid+1;
            else end=mid-1; 
        }

        return end;
    }
    public static void main(String[] args) {
        int num=25;   //// We can Use Array also to check the SquareRoot
        System.out.println(mySqrt(num));
    }
}





public class SquareRoot {
    public static void main(String[] args) {
        
        int sqrt[]={4,25,16,49};
        // if(sqrt<2)System.out.println(sqrt);
        int temp1=1;
        int temp2=1;
        int x=0;
        while(sqrt[x]!=temp1*temp2){
            if(temp1==temp2){
                temp1++;temp2++;
                for(int i=0;i<sqrt.length;i++){
                    sqrt[i]=temp1=temp2;
                }
            }

        }
        
        for (int y : sqrt) {
            System.out.println(y);
        }
        System.out.print(temp1);
        System.out.println("*"+temp2);
    }
}

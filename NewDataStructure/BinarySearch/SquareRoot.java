package NewDataStructure.BinarySearch;

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

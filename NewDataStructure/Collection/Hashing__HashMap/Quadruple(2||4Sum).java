package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashMap;

class Quadruple{

    class Pair{
        int i,j;

        public Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }


    public static int FourSum(int arr[],int sum){
        HashMap<Integer,Pair> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                
            }
        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,0,6};
        int sum=12;
        System.out.println(FourSum(arr,sum));
    }
}
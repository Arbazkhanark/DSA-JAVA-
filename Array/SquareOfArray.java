public class SquareOfArray {
    public static void main(String[] args) {
        int arr[]={-1,-4,0,4,6};
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        int sq=arr[i];
            sq*=arr[i];
            res[i]=sq;
        }
        System.out.println("Before");
        for (int i : res) {
            System.out.print(" "+i);
        }

        int temp=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                if(res[i]<res[j]){
                    temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                }
            }
        }

        System.out.println("\nAfter");
        for (int i : res) {
            System.out.print(" "+i);
        }
    }
}

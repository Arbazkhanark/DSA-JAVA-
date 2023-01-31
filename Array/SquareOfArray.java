public class SquareOfArray {
    public static void main(String[] args) {
        int arr[]={4,25,0,36,49};
        int res[]=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            res[i]=arr[i]*arr[i]/arr[i];
        }
        System.out.println("Before");
        for (int i : res) {
            System.out.print(" "+i);
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                if(res[i]<res[j]){
                int temp=res[i];
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

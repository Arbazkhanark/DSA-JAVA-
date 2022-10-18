// Transpose an Araay.


class Transpose{
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},{4,5,6}
        };

        int temp[][]=new int[arr[0].length][arr.length];
        // int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
                temp[j][i]=arr[i][j];

                System.out.print(temp[i][j] +" ");
            }
            System.out.println();
        }

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(i<=j){
        //             temp[i][j]=arr[i][j];
        //             arr[i][j]=arr[j][i];
        //             arr[j][i]=temp[i][j];
        //         }
        //         System.out.print(arr[i][j]);

        //     }
        //     System.out.println();
        // }


        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){

        //         System.out.print(arr[j][i] +" ");
                
        //     }
        //     System.out.println();
        // }
    }
}
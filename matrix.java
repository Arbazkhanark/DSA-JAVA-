import java.util.Scanner;

//It will print the 2D(two D) Array
class matrix{
    public static void main(String[] args) {
        int arr[][]={
            {1,3,6},
            {2,5,8},
            {4,8,4}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}


////Searching for an element x in a matrix.
class SearchElement_In_TwoD_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Row: ");
        int row=sc.nextInt();
        System.out.print("Column: ");
        int col=sc.nextInt();
        
        int arr[][]=new int[row][col];

        for(int i=0;i<row;i++){
            System.out.println("Row: "+i+" ");
            for(int j=0;j<col;j++){
                System.out.print("Col: "+j+" ");
                arr[i][j]=sc.nextInt(); 
            }
        }

        System.out.println("Print:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the key which you want to get: ");
        int key=sc.nextInt();
        int temp=-1;
        System.out.println("Search a Key: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==key){
                    System.out.println("("+i+","+j+")");
                    temp=key;
                    // System.out.println(i+""+j);   
                }
            }
            
        }if(temp!=key){
            System.out.println("Search key is not in a Matrix :(");
        }
    }
}




 class Add_TwoD_Array{
    public static void main(String[] args) {
        int arr[][]={
            {2,1},
            {1,3}
        };
        int arr2[][]={
            {1,3},{1,4}
        };

        int res[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                res[i][j]=arr[i][j]+arr2[i][j];
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
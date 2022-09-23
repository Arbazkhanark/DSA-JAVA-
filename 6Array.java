import java.util.Scanner;

class Array{
    public static void main(String[] args) {
        
        int ageList[]=new int[5];

        ageList[0]=23;
        ageList[1]=20;
        ageList[2]=2;
        ageList[3]=13;
        ageList[4]=3;
        System.out.println(ageList[1]);
        //for each loop
        for(int age : ageList){
            System.out.println(age);
        }
    }
}


class Array2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new  int[6];

        for(int i=0;i<arr.length;i++){
           System.out.print("Enter number: ");
            arr[i]=sc.nextInt();
        }

        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }

    }
}

class Array3{
    public static void main(String[] args) {
        //One Dimensional
        int a[]={2,4,1,5,8,0};
        System.out.println("One Dimensional: "+ a[2]);

        //Two Dimensional
        final int arr[][]={
            {2,4,6},{4,6,2},{9,6,1}
        };
        System.out.println("Two Dimensional: "+ arr[0][2]);
    }
}
// 1. Write a java program to find the numbers Greater than the Average of the numbers of a given Array.

package JavaPractice2;
class Greater{
    public static void main(String[] args) {
        int arr[]={5,8,6,3,1,0};

        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr [i];
            // System.out.println(arr[i]);
        }
        System.out.println("This is sum of all elements: "+sum);
        float avg=sum/arr.length;
        System.out.println("This is the Average of this Array: "+avg);

        
        System.out.print("This is Greater than Average number: ");
        for(int x=0; x<arr.length;x++){
            if(arr[x]>avg){
                System.out.print(arr[x]+",");
            }
        }
    }
}
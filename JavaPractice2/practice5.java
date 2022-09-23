// 5.Write a java program to Seprate 0s on left side and 1s on right side of an array of 0s and 1s in random order.

package JavaPractice2;

class Seprate{
    public static void main(String[] args){

        int arr[]={0,1,1,2,3,0};
        int temp=0;

        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
        
        
    }
}
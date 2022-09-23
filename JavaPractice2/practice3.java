// 3. Write a java program to sum values of an Array.

package JavaPractice2;

class Add{
    public static void main(String[] args) {
        
        int arr[]={5,8,2,5,7,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
    }
    System.out.println(sum);
    }
}
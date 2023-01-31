import java.util.ArrayList;
import java.util.Collections;

class Heyyyy{

    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,1,3,2,1,2,1};
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int k=0;
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int n=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            left[k++]=max;
            System.out.println(left[i]);
        }

        System.out.println("----------------------------------------");
        int x=right.length-1;
        for(int j=n;j>0;j--){
            if(arr[j]>max1){
                max1=arr[j];
            }
            right[x--]=max1;
            System.out.println(right[j]);
        }


        
    }
}




//// Without Using Space Complexity
class ReverseArray{
    public static void main(String[] args) {
        int arr[]={2,5,1,0,3,8};

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}


//// Using Space Complexity
class reverseArray{
    public static void main(String[] args) {
        int arr[]={2,4,7,8,1};
        int res[]=new int[arr.length];

        int temp=0;
        for(int i=arr.length-1;i>=0;i--){
            res[temp++]=arr[i]; 
        }

        for (int i : res) {
            System.out.println(i);
        }
    }
}


class ReverseArray_Using_ArrayList{
    public static void main(String[] args) {
        // int arr[]={3,6,9,10,8,7,3,1,0};
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(6);
        arr.add(9);
        arr.add(10);
        arr.add(8);
        arr.add(7);
        arr.add(3);
        arr.add(1);
        arr.add(0);

        System.out.println("Before:"+arr);
        
        Collections.reverse(arr); 

        System.out.println("After:"+arr);

    }
}
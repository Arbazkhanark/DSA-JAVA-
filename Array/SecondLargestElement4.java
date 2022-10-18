//// Second Largest Element from an array.


// import java.util.Collection;
// import java.util.Arrays;

class SecondLargest{

    //Time complexity in this code =theta(n) // O(n)

    public static int secondlargest(int a[]){

        if(a.length<2) return -1;
        int l=0;
        int sl=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                sl=l;
                l=a[i];
            }else if(a[i]<l){
                if(a[i]>sl){
                    sl=a[i];
                }
            }
        }

        return sl;
    }

    public static void main(String[] args) {
        int arr[]={12,34,32,96,699,0,22,12,122,750};

//This is the Second method to find Second Largest Element from an array with the Help of SORTING.
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // int sl=arr.length-2;
        // System.out.println(arr[sl]);

        int res=secondlargest(arr);
        System.out.println("Second Largest Elemet: "+ res);
    }
}
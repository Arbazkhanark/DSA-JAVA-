// 4.Write a java program to find the MAXIMUM and MINIMUM value of an Array.

package JavaPractice2;

class MaxMin{
    public static void main(String[] args) {
        int arr[]={2,8,-1,2,102,35,21,9,54,75};

        int max=arr[0];
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            } if(arr[i]<max){  //(arr[i]<min)
                max=arr[i];  //min=arr[i];
            }
            
        }
        System.out.println("MAXIMUM: "+max);
        // min=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){  //(arr[i]<min)
                max=arr[i];  //min=arr[i];
            }
        }
        System.out.println("MINIMUM: "+ max);  //(min)
    }
}
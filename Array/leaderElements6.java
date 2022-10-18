//Find Leaders element from array.

class LeadersElements{

    public static void main(String[] args) {
        
        int arr[]={9,8,2,7,5,6,1,2,4,3};
        int n=arr.length-1;
        int temp[]=new int[5];
        int j=0;
        int min=Integer.MIN_VALUE;

        for(int i=n;i>0;i--){
            if(arr[i]>min){
                min=arr[i];
                //sout(arr[i]);   Now we don't need that else condition...
            }else if(arr[i]<min){
                continue;
            }
            System.out.println(min);
            temp[j++]=arr[i];
        }

        System.out.println("Reverse An Elements...");

        for(j=temp.length-1;j>=0;j--){
            System.out.print(temp[j]);
        }

    }
}
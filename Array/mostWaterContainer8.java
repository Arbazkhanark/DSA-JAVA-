class MostWaterContainer{

    public static void main(String[] args){
        int arr[]={1,8,6,2,4,5,8,3,7};

        int st=0;
        int end=arr.length-1;
        int area=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<end;i++){
            int distance=end-i;
            if(arr[st]>=arr[end] && area>=max){
                max=area;
                area=distance*arr[end]; 
                end--;
                i=i-1;
            }else if(arr[st]<arr[end] && area>=max){
                max=area;
                area=distance*arr[st];
                st++;
            }
        }
        System.out.println(max);

    }
}
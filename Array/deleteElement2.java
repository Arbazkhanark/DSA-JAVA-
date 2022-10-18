class DeleteElement {
    public static  int delete(int a[],int k){
        
        int i=0;
        int n=a.length;
        int res=-1;
        for(;i<n;i++){
            if(a[i]==k){
                res=i;
                break;
            }
        } if(res==-1){
            return -1;
        }else{

            for(int j=i;j<n-1;j++){
                a[j]=a[j+1];
        }
        }
        return a[i];
    }

    public static void main(String[] args){
        int arr[]={2,1,4,6,5};
        int key=1;

        delete(arr,key);
      //  System.out.println(delete(arr,key));
        for(int e:arr){
            System.out.println(e);
        }

}
}
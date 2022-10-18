// Search a key if it exist in array Element.

class Find{

    public static void main(String[] args) {
        int arr[]={2,4,7,9,2,3,5};
        int key=7;
        int res=-1;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                res=i;
                break;
            }
        }if(res==-1){
            System.out.println("Not Found!!!!");
        }else{
            System.out.println("Found: "+res);
        }
    }
}
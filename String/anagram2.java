package String;

class AnagramSecond{
    public static void main(String[] args) {
        String str="race";
        String str2="cre";
        int arr[]=new int[256];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str.charAt(i)]--;
        }
        for(int e:arr){
            if(e!=0){
                System.out.println("False");
                break;
            }
        }
            System.out.println("True");
    }
}
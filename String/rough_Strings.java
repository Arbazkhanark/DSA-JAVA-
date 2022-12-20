package String;

// class ReverseWithValues{
//     public static void main(String[] args) {
//         String str="abcdefg";
//         char ch[]=str.toCharArray();
//         int key=2;
//         int j=key-1;
//         char temp=' ';

            
//             int i=0;
//             while(i<=key && key<ch.length){
//                 temp=ch[j];
//                 ch[j]=ch[i];
//                 ch[i]=temp;
//                 i=i+6;
//             }
//         System.out.println(ch);
//     }
// }

class ReverseWords{
    public static void Reverse(char ch[],int start, int end ){
        char temp='x';
        for(int i=start;i<end;i++){
            temp=ch[end];
            ch[end]=ch[i];
            ch[i]=temp;
            end--;
        }
    }
    public static void main(String[] args) {
        String str="I am the boss";

        char arr[]=str.toCharArray();
        int start=0;
        int end=0;
        for(;end<arr.length;end++){
            if(arr[end]==' '){
                Reverse(arr, start, end-1);
                start=end+1;
            }
        }
        Reverse(arr, start, end-1);

        Reverse(arr, 0, str.length()-1);

        System.out.println(arr);
    }
}
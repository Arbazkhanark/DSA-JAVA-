package String;

class Reverse{
    public static void main(String[] args) {

        // 1.
        char arr[]={'h','e','l','l','o'};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }


        // 2.
        String str="Hey I am Arbaaz Khan";  //nahK zaabrA ma I yeH
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("    Next ");

        

        // 3.
        char s[]={'h','e','l','l','o'};
        char temp='y';
        int n=s.length-1;
        for(int i=0;i<=n;i++){
                temp=s[n];
                s[n]=s[i];
                s[i]=temp;
                n--;
        }
        System.out.println(s);

        

 
    }
}
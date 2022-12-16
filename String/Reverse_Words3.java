package String;

class ReverseWord{

        public static void reverse(char ch[],int start,int end){
            char temp='y';
            for(int i=start;i<end;i++){
                temp=ch[end]; //r,e,
                ch[end]=ch[i]; //N,e
                ch[i]=temp;    //r,e
                end--;
            }
        }                               

    public static void main(String[] args) {


        String str="Never Give Up";
        char ch[]=str.toCharArray();
        int start=0;
        int end =0;
        for(;end<ch.length;end++){
            if(ch[end]==' '){
                reverse(ch,start,end-1);
                start=end+1;
            }
        }
        reverse(ch,start,end-1);
        
        reverse(ch,0,str.length()-1);

        System.out.println(ch);

    }
}
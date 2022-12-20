package String;

class Pattern{
    public static void main(String[] args) {
        String str="abcabaadabdabda";
        String str2="baa";
        int n1=str.length()-1;
        int n2=str2.length()-1;
        for(int i=0;i<=n1-n2;i++){
            int j=0;
            for(;j<n2;j++){
                if(str.charAt(i+j)!=str2.charAt(j)){
                    break;
                }
            }
            if(j==n2){
                System.out.println("Pattern Found at "+i);
            }
        }
    }
}
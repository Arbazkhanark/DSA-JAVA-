
package math;
 
class palindrome{
    public static void main(String[] args) {
        int n=13221;
        int rev=0;
        int temp=n;

        while(n>0){
        rev=(rev*10)+n%10;
        // System.out.println(rev);
        n/=10;
        }
        System.out.println(rev);
        System.out.println(temp);
        if(rev==temp){
            System.out.println("Yes, It is a Palindrome :)");
        }else{
            System.out.println("No, It is not a Palindrome :(");
        }
    }
}
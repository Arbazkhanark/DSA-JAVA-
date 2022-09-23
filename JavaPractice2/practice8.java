// 8.Write a java program to find the Factorial value of any number entered through the keyboard.

package JavaPractice2;

class Factorial{
    public static void main(String[] args){
        int n=10;
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*i;
        }
        System.out.println(temp);
    }
}
// 6. Write a Java program to swap two numbers.

package JavaPractice1;

import java.util.Scanner;
class Swap{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of X: ");
        int x=sc.nextInt();
        System.out.print("Enter the Value of Y: ");
        int y=sc.nextInt();

        int temp=0;
        temp=x;
        x=y;
        y=temp;

        System.out.println("The Value of X: "+x);
        System.out.println("The Value of Y: "+y);

        
    }
}
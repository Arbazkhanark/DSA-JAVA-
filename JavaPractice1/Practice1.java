//1. Write a java program that takes two numbers as input and display the Product of two numbers.

package JavaPractice1;

import java.util.Scanner;

class Product{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your First number: ");
        int num1=sc.nextInt();

        System.out.print("Enter your Second number: ");
        int num2=sc.nextInt();

        int res=num1*num2;
        System.out.println("The Product of these numbers: "+res);
    }
}
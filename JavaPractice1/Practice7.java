// 7. Write a java program to grade Students based on their marks.

package JavaPractice1;

import java.util.Scanner;
class Grade{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks=sc.nextInt();
        sc.close();

        if(marks>90){
            System.out.println("A++");
        }else if(marks>80){
            System.out.println("A");
        }else if(marks>70){
            System.out.println("B");
        }else if(marks>60){
            System.out.println("C");
        }else if(marks>50){
            System.out.println("D");
        }else{
            System.out.println("FAIL");
        }
    }
}
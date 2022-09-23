// 2. Write a java program that takes a input and prints its multiplication table upto 10.
package JavaPractice2;

import java.util.Scanner;
class Table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number for Table: ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            int mul=n*i;
            System.out.println(n+" * "+i+" = "+mul);
        }
    }
}
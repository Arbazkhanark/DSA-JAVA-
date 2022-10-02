// 3.Write a java program that reads a number in inches, converts it to meters.
package JavaPractice1;

import java.util.Scanner;

class Meters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Inches to convert in Meters: ");
        float inch=sc.nextFloat();
        sc.close();

        float meter=inch/39.37f;

        System.out.println("Meter : "+meter);
    }
}
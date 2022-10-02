package JavaPractice1;
// 2. Write a Java program to print the area and permeter of a circle.

import java.util.Scanner;

class Circle{
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Radius of Circle :");
        float radius=sc.nextFloat();
        sc.close();

        float pie=3.14f;
        float permeter=2*(pie*radius);

        float area=pie*radius*radius;

        System.out.println("The permeter of Circle is: "+permeter);
        System.out.print("The Area of Circle is: "+area);
    }
}
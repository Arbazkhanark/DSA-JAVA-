// 5. Write a java Program that takes a year from user and point whether that year is a Leap year or Not.

package JavaPractice1;
import java.util.Scanner;

class Leap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year=sc.nextInt();
        sc.close();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year+" This is Leap Year");
        }else{
            System.out.println(year+" This is Notttt a Leap Year");
        }
    }
}
// 4. Take Three numbers form the user and print the greatest Number.
package JavaPractice1;

import java.util.Scanner;

class Greatest{
    public static void main(String[] args){
        Scanner ac=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=ac.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=ac.nextInt();
        System.out.print("Enter Three Number: ");
        int num3=ac.nextInt();
        ac.close();

        if(num1>num2){
            if(num1>num3){
                System.out.println("The First Number is Greatest: "+num1);
            }else{
                System.out.println("The Third Number is Greatest: "+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("The Second Number is Greatest: "+num2);
            }else{
                System.out.println("The Third Number is Greatest: "+num3);
            }
        }
    }
}
import java.util.Scanner;

class Inputoutput{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        System.out.println("Here is your Age: " + age);

        System.out.println("Now, Enter your Full Name: ");
        String name=sc.next();
        System.out.println("Here is your name But it is Half Because We use next : "+name);

        System.out.println("Now, You can Enter Full Name: ");
        // sc.nextLine();  // It will read full line..
        sc.nextLine();//It store Enter,, Without this below line will not asking for input because it will Store Enter.
        String fname=sc.nextLine();
        System.out.println("Here is your Full name Because we use nextLine here: "+fname);
    }
}
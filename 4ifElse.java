import java.util.Scanner;

class Condition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You can Vote, Age: "+age);
        }else{
            System.out.println("You can't Vote, Because your Age is: "+age);
        }
    }
}

//Grading System
class Marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Marks: ");
        int marks=sc.nextInt();

        if(marks>90){
            System.out.println("Your Grade: A++🥳🥳🥳🥳");
        }else if(marks>80){
            System.out.println("Your Grade: A+🥳🥳");
        }else if(marks>70){
            System.out.println("Your Grade: B🥳");
        }else if(marks>60){
            System.out.println("Your Grade: C😃");
        }else if(marks>50){
            System.out.println("Your Grade: D😥");
        }else{
            System.out.println("Your Grade: FAIL😞");
        }
    }

}




//Nested IfElse
//Greater Number in Three numbers..

class NestedIfElse{
    public static void main(String[] args) {
        int a=13;
        int b=43;
        int c=67;

        if(a>b){
            if(a>c){
            System.out.println("A is Greater!!");
            }else{
                System.out.println("C is Greater!!");
            }
        }else{
            if(b>c){
                System.out.println("B is Greater!!");
            }else{
                System.out.println("C is Greater!!");
            }
        }
    }
}
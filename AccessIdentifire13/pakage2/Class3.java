package AccessIdentifire13.pakage2;

import AccessIdentifire13.pakage1.Class2;

public class Class3{

    ////  Public helps to access from anywhere either same pakage or different pakage.
    public void method3(){
        System.out.println("I am Method 3 from Class3 and from pakage2");
    }


}

class Other extends Class2{
    public static void main(String[] args) {
        Other o=new Other();  ////  It is Inherited --------------------------IMP--------------------
        o.greetings();   //Public
        o.check2();  // Because check2() is Protected so Outside of pakage is working When we create Child's Object.
    }
}
package AccessIdentifire13.pakage1;

public class Class2{

    public void greetings(){
        System.out.println("Hey Sir, Good Morning");
    }

    public static void main(String[] args){
        Child child=new Child();
        child.method2();  //// If you do not you Inheritance than it is also an Error.
        // child.check();  This will show an Error because It is Private.

    }


    ///Default is use for access in same pakage, even diffrent file in same pakage.
    void method2(){ 
        System.out.println("I am Method from Class-2 and from Pakage1");
        
        check();//  We can you here because it is stricted from other classes. 
    }


    /// Private is use to access only in class.
    private void check(){
        System.out.println("I am Private so you can access me in current pakage Not Other Packages");
    }

    //// Protected ,, only child class can access that within the package.
    protected void check2(){
        System.out.println("I am Protected from class2 & from Pakage1");
    }
    
}

class Child extends Class2{

    public void checkChild(){
        System.out.println("This is the Method of Child class from Pakage1");
    }


    public static void main(String[] args) {
        Class2 o=new Class2();
        o.method2();
        o.check2();
        // o.check();    //This show an Error
    }
   
}
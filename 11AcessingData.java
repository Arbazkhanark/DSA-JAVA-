
class Teacher1{
    //PROPERTIES
    String name;
    int age;
    String sub;

    static int count;  // STATIC  helps to access the variable Directly, Without using Object.

    //BEHAVIORS
    void work(){
        System.out.println("Teacher teach the Students to Educate");
        count++;
    }
    void work(String attend){
        System.out.println("Teacher take the Attendace "+attend);
    }



    // --------------------   Constructor    --------------------------
    public Teacher1(){
        System.out.println("I am Constructor, call");
        this.work();
        count++;
    // This is Constructor But This is hide all the time but it is there to help to create the Object
    }
    public Teacher1(String name ,int age){
        this.name=name;
        this.age=age;
        work();
        System.out.println("I am Second Constructor which have some Parameter");

        //This has the Same Name as before but This is also a Constructor 

    }
    
    
    // This is also a Constructor Overloading...

}


class Access{
    public static void main(String[] args) {

        // Teacher t1=new Teacher();
        Teacher1 t2=new Teacher1("hey",23);
        //              ^^>This is CONSTRUCTOR, Same name as Object's Class. 

/*
        t2.name="KamalPreet";
        t2.age=32;
        t2.sub="Operating System";
 */


        System.out.println(t2.name+" Age "+t2.age);


        System.out.println("Count: "+Teacher1.count); // STATIC  helps to access the variable Directly.
    }
}
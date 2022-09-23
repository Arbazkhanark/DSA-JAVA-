// Constructor: It helps to create Object,  It have the Same Name as Class.


// Default Constructor: Java Automatically create the Empty Parameter Constructor to creating an OBJECT.

// This may also run when Constructor Overloading.......


class Teacher{
    //PROPERTIES
    String name;
    int age;
    String sub;

    //BEHAVIORS
    void work(){
        System.out.println("Teacher teach the Students to Educate");
    }
    void work(String attend){
        System.out.println("Teacher take the Attendace "+attend);
    }

    public Teacher(){
        System.out.println("I am Constructor, call");

    // This is Constructor But This is hide all the time but it is there to help to create the Object
    }
    public Teacher(String newName){
        System.out.println("I am Second Constructor which have some Parameter");

        //This has the Same Name as before but This is also a Constructor 

    }
    
    
    // This is also a Constructor Overloading...

}


class Constructor{
    public static void main(String[] args) {

        Teacher t1=new Teacher();
        Teacher t2=new Teacher("hey");
        //              ^^>This is CONSTRUCTOR, Same name as Object's Class. 

        t1.name="KamalPreet";
        t1.age=32;
        t1.sub="Operating System";

        t2.name="Dinesh";
        t2.age=40;
        t2.sub="N/A";

        System.out.println(t2.name+" Age "+t2.age);
        System.out.println(t1.name+" Age "+t1.age);

        t2.work();
        t1.work("Daily");
    }
}
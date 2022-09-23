// class is nothing, Its just help us to make OBJECTS.
//OBJECTS have PROPERTIES and BEHAVIOR

class Oops{
    public static void main(String[] args){

        //OBJECTS a1 AND b1.
        Animal a1=new Animal();
        Animal a2=new Animal();

        a1.name="Cow";
        a1.legs=4;

        a2.name="BoB";
        a2.legs=2;

        System.out.println("A1 Name: "+a1.name+" And Legs: "+a1.legs);


        a1.walk();         //Method Overloading
        a1.walk(4); //Method Overloading
    }
}

//New Class
class Animal{
    //PROPERTIES:
    int legs;
    String name;

    //BEHAVIORS:
    void walk(){
        System.out.println(name+" is Walking....");
    }
    void walk(int steps){
        System.out.println("Animal is walked "+steps+" Steps");
    }
// If Two or more than 2 method have SameName but Different PARAMETERS (Variale, Datatype) know as METHOD OVERLOADING.


}
// Method Overloading :- If 2>= Method have SAME NAME but differance in PARAMETER.

class Car{
    //PROPERTIES
    String color;
    String name;

    //BEHAVIORS
    void action(){
        System.out.println("CAR can Action...");
    }
    void action(String x){
        System.out.println("Car Highest Speed: "+x);
    }
    void action(int gear){
        System.out.println("Car have "+gear+" Gear.");
    }
// Above Method is called Method Overloading. 
}



class MethodOverloading{

    public static void main(String[] args){

        Car c1=new Car();
        Car c2=new Car();

        c1.name="Fararri";
        c1.color="Red";

        c2.name="Audi";
        c2.color="Grey";

        c2.action();
        c2.action(4);
    }
}

class Dada{
    String name;
    int age;
    String occopation;

    void sarname(){
        System.out.println("KHAN");
    }

    void work(){
        System.out.println("Farmer");
    }
}

class BaapJi extends Dada{   
    int income;

    void work(){
        System.out.println("Hard Work");
    }
    void sarname(){
        System.out.println("Explore");
    }
}

class Beta extends Dada{

    void work(){
        System.out.println("Learn");
    }
    void work(int a){
        System.out.println("Fun");
    }
}

class Inheritance{
    public static void main(String[] args) {

        Beta a1=new Beta();
        a1.name="Arbaaz";
        a1.work();

        BaapJi b1 =new BaapJi();
        b1.name="Islam";
        b1.sarname();

        Dada d1=new BaapJi();
        d1.work();

        System.out.println(a1.name);
        System.out.println(b1.name);
    }
}
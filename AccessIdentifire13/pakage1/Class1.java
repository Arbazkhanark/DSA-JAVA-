////////Running File is this //////////////

package AccessIdentifire13.pakage1;

import AccessIdentifire13.pakage2.Class3;

public class Class1{

    public static void main(String[] args){

        Class2 obj2=new Class2();
        obj2.method2();     //This is in same pakage (Pakage1) so that's why it is not showing an Error, No need to Put Public , Either it's default there is no Error , If this method is private than it will show us an Error.

        Class3 obj3=new Class3();
        obj3.method3();  //This is in different pakage (Pakage2) So, method3 is public so that is not passing an Error. And if this Method is default,private than it will show us an Error.
        // obj3.check2();  // This is Protected so this is not a child class of that class.

    }
}


class Pro extends Class2{

    public static void main(String[] args) {
        Class2 o=new Class2();
        o.method2();
        o.check2();

    }
}

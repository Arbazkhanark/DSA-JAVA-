// Encapsulation helps to HIDE the Data or RESTRICT the Data....
// Data Hiding....

class Encapsulation{

    public static void main(String[] args) {
        Test obj=new Test();
        // obj.data=105;
        obj.setData(105);
        obj.setData(17); // This is restricted Now.....

        System.out.println(obj.getData());

    }
}

class Test{
    private int data;

    //Setter
    public void setData(int data){
        /// Validation in Setter
        if(data>100){              
            this.data=data;
        }
        else{
            System.out.println("You can not change that :("); /// if user change value less than 100.....
        }
    }


    //Getter
    public int getData(){
        return data;
    }

    
}
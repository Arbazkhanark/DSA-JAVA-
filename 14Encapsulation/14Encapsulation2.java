
class Bank{

    public static void main(String[] args) {
        AddBalance obj=new AddBalance();
        obj.setData(1234,200);
        // obj.otp=123;
        // obj.amt=200;
        System.out.println(obj.getData());
    }
}

class AddBalance{
    private int otp=1234;
    private int amt;


    public int getData(){
        return this.amt;
    }


    public void setData(int otp,int amt){
        if(otp==this.otp){
            this.amt=amt;
        }else{
            System.out.println("Invalid OTP :(");
        }
    }

}
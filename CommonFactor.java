// Example: Find the CF of 12 and 8.

// Factors of 12: 1, 2, 3, 4, 6, 12
// Factors of 8: 1, 2, 4, 8

// Common Factors: 1, 2, 4  =3 Answer

///////////// Greatest Common Factor: 4
//////////////////////////////////////   Common Factor of 12 and 8 is == 3      ////////////////////////////////


class CommonFactor{
    public static void main(String[] args) {
        int a=12;
        int b=8;
        int res=1;
        int count=0;

        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                res=i;
                count++;
                System.out.println(res);
            }
        }
        System.out.println("Factor: "+count);

    }
}

// USE For Loop require :- If we know the number of iterators
class For{
    public static void main(String[] args){
        int x=10;
        for(int i=0;i<=x;i++){
            System.out.println(i);
        }
    }
}


//USE While Loop require:- If we know the condition to stop the LOOP
class While{
    public static void main(String[] args){
        int x=10;
        int y=0;
        while(y<=x){
            System.out.println(y);
            y++;
        }
    }
}

// At Least user want to execute the loop.
class DoWhile{
    public static void main(String[] args){
        
        int i=1;
        do{
            System.out.println("Hello");
            i++;
        }while(i<=2);
    }
}

class Loop{
    public static void main(String[] args){

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
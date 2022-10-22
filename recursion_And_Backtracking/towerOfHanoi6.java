// Find the

package recursion_And_Backtracking;

class TowerOfHanoi{

    public static void tower(int n, char from,char to,char aux){
        if(n==0) return;

        tower(n-1,from,aux,to);
        System.out.println("Move "+n+" From " +from+" To "+to+" Using "+aux);
        tower(n-1,aux,to,from);
    }


    public static void main(String[] args) {
        tower(3,'A','C','B');
    }
}
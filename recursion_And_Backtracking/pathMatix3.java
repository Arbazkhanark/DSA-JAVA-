// Find the Number  of paths in an nxm Matrix.
// 1. right and down only..


package recursion_And_Backtracking;

class Total_path{

    public static int path(int n, int m) {
        if(n==1 || m==1) 
        return 1;

        return path(n,m-1)+path(n-1,m);
    }


    public static void main(String[] args) {
        System.out.println(path(6,2));
    }
}
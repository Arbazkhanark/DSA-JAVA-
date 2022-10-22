// Rat in a Maze.

package recursion_And_Backtracking.backtracking;

class Maze{

    public static boolean rat(int a[][], boolean vis[][],int i,int j){
        //Base Conditions
        if(i==a.length || j==a.length || a[i][j]==0 || vis[i][j]) return false;
        if(i==a.length-1 && j==a.length-1) return true;
        
        
        //First Cell is True if Above One(first) Condition is not true
        vis[i][j]=true;
        
        //SubProblems
        //RAT move to rows (Downside)
        if(rat(a, vis, i+1, j)) return true;
        //RAT move to columns (RightSide)
        if(rat(a,vis,i,j+1)) return true;

        //If There is a Dead End.
        vis[i][j]=false;
        //BackTracking
        return false;

    }

    public static void main(String[] args) {
        
        int arr[][]={
            {1,1,1,0},
            {1,0,0,1},
            {1,1,1,1},
            {0,0,1,1}
        };
        boolean vis[][]=new boolean[arr.length][arr.length];
        boolean isPossible=rat(arr,vis,0,0);
        System.out.println(isPossible);

    }
}
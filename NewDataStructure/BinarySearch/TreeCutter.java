package NewDataStructure.BinarySearch;
import java.util.Scanner;


/////////////////    Without Binary Search  ///////////////
class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();

            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();

            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}
// } Driver Code Ends


class Solution
{
    static int find_height(int tree[], int n, int k)
    {
        //Highest Tree From the Array
        int high=0;
        for(int i=0;i<tree.length;i++){
            if(tree[i]>high){
                high=tree[i];
            }
        }


        //// Machine will Check Its Height if Height Set to the Total-Collection(k) of Wood
        for(int machine_height=0;machine_height<high;machine_height++){
            int wood_collection=0;

            ////Height of tree will cut => if tree height is greater than Machine-height
            for(int tre=0;tre<n;tre++){
                if(machine_height<tree[tre]){
                    wood_collection+=tree[tre]-machine_height;
                }
            }

            //// Wood collection at that height is same than the Machine Height is Accurate There..
            if(wood_collection==k){
                return machine_height;
            }
        }
        return -1;
    }
}










///////////////////////////////////////////// Third Way to (Binary Search) /////////////////////
class TreeCutterBinary{
    public static int height(int tree[],int k){
         
        //// It finds the Highest Tree From Array
        int end=0;
        for(int j=0;j<tree.length;j++){
            if(tree[j]>end){
                end=tree[j];
        }
        
        int start=0;
        while(start<=end){
            int machine_Height=(start+end)/2;  /////   (Binary Search)
                
///// It will Collect the Woods                
                int wood_collection=0;
                for(int i=0;i<tree.length;i++){
                    if(machine_Height<tree[i]){
                        wood_collection+=tree[i]-machine_Height;
                    }
                }


////// This will check the Machine_Height Acc to Wood Required
                if(wood_collection==k){
                    return machine_Height;
                }else if(wood_collection>k){
                    start=machine_Height+1;
                }else{
                    end=machine_Height-1;
                }
                
            }
        }
    return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={81,13,36,65,38,69};
        int total=47;
        int res=height(arr, total);
        System.out.println(res);

    }
}




















///////   Without Binary Search   ////
class TreeAfterCutter {
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int total=13;

        int res[]=new int[arr.length];

        int machineCutter=5;
        int result=0;
        int i=0;
        while(result<=total && i<arr.length){
            if(arr[i]>machineCutter){
                result=arr[i]-machineCutter;
                res[i]=result;
                i++;
            }else{
                i++;
            }
        }

        for (int x : res) {
            System.out.println(x);
        }

        result=0;
        System.out.println("Treee After Cutting Height");
        for(int y=0;y<res.length;y++){
            result+=res[y];                                 //////0,5,4,0,0,4,0
        }
        System.out.println("Height Of Machine: "+result);        /////  14
    }
}














/////////////////////////////// Second Way  ///////
class TreeAfterCutting{
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int total=13;

        int machine_Height=5;
        int result=0;
        int i=0;

        while(result<=total && i<arr.length){
            if(machine_Height<arr[i]){
                result+=arr[i]-machine_Height;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(result);
    }
}



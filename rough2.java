
// class Solution {
//     public static long reverse(int x) {

//         long rim,rev = 0;
//         while(x!=0){


//             rim = x%10;
//             rev =  rev*10+rim;
//             x = x/10;
//         }
//         return rev;
//     }


//     public static void main(String[] args) {
//         int n=1534236469;
//         // int res=reverse(n);
//         System.out.println(reverse(n));
//     }
// }



///////////////////////////////       Second Mehod       //////////////////////////////////////////

// class Solution {
//     public static int reverse(int x) {

//         int rim;
//         long rev=0;
//         while(x!=0){
            
//             rim = x%10;
//             rev =  rev*10+rim;
//             x = x/10;
//             if((rev < Integer.MIN_VALUE) || (rev > Integer.MAX_VALUE)){
//                 return 0;
//             }
//         }
//         return (int)rev;
//     }


//     public static void main(String[] args) {
//         int n=21474;
//         // int res=reverse(n);
//         System.out.println(reverse(n));
//     }
// }










// class Solution {
//     public static boolean isPalindrome(int x) {
//         int rim;
//         int rev=0;
//         int temp=x;
//         boolean is_Palindrome=false;
//         while(x!=0){
//             rim=x%10;
//             rev=rev*10+rim;
//             x/=10;
//         }
//         System.out.println(rev);
//         if(temp==rev){
//             System.out.println("Barabrrr");
//             is_Palindrome=true;
//             if(temp<0){
//                 is_Palindrome=false;
//             }
//         }else{
//             System.out.println("NAhaahe barabarr");
//             is_Palindrome=false;
//         }
//         return is_Palindrome;
//     }
//     public static void main(String[] args) {
//         int x=121;
//         System.out.println(isPalindrome(x));
//     }

// }








// class Leet{
//     public static void main(String[] args) {
//         int n=20;
//         int temp=n;
//         long fact=1;
//         int count=0;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//             temp=temp/5;
//             count+=temp;
//         }
//         System.out.println(fact);
//         System.out.println(count);
//     }
// }






// class Solution {
    

//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,3,4,4,5,5,7,7};

//         int count=1;
//         int temp=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==arr[i+1]){
//                 count+=1;
//             }
//             if(arr[i]!=arr[i+1]){
//                 count-=1;
//                 // System.out.println(arr[i]);
//                 if(count==0){
//                     temp=i;
//                     // System.out.println(arr[i]);
//                     break;
//                 }
//             }
//     }
//     System.out.println(arr[temp]);
// }
// }


// class Solution {
//     public static int duplicate(int num[]){
//         int count=1;
//         int temp=0;
//         for(int i=0;i<num.length;i++){
//             if(num.length<2){
//                 return num[i];
//             }
//             if(num[i]==num[i+1]){
//                 count+=1;
//             }
//             if(num[i]!=num[i+1]){
//                 if(num[num.length-1]!=num[num.length-2]){
//                     return num[num.length-1];
//                 }
//                 count-=1;
//                 if(count==0){
//                     temp=i;
//                     break;
//                 }
//                 // if(num[num.length-1]!=num[num.length-2]){
//                 //     return num[num.length-1];
//                 // }
                
//             }
//     }
//         return num[temp];
//     }
//     public static void main(String[] args) {
//         int arr[]={1,1,3,4,4};
//         System.out.println(duplicate(arr));

//     //     int count=1;
//     //     int temp=0;
//     //     for(int i=0;i<arr.length;i++){
//     //         if(arr[i]==arr[i+1]){
//     //             count+=1;
//     //         }
//     //         if(arr[i]!=arr[i+1]){
//     //             count-=1;
//     //             if(count==0){
//     //                 temp=i;
//     //                 break;
//     //             }
//     //         }
//     // }
//     // System.out.println(arr[temp]);
// }
// }



class Leetcode{
    public static int remove(int arr[] ,int remove){
        int i=0;
        for(;i<arr.length-1;i++){
            if(arr[i]==remove){
                continue;
            }
            // System.out.println(arr[i]);
        }
            return arr[i];   
        
    }
    public static void main (String[] args){
        int arr[]={1,2,2,4,5,7,1,2,7,9};
        int remove=2;
        System.out.println(remove(arr,remove));
    }
}
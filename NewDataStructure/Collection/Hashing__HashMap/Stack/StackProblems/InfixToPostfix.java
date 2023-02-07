package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.ArrayDeque;
import java.util.Stack;


class InfixToPostfix1{

    public static Boolean isOperator(char ch){
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'; 
    }

    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }else if(ch=='*' || ch=='/') {
            return 2;
        }else{
            return -1;
        }
    }


    static StringBuilder InfixConvertPostfix(String str){

        StringBuilder res =new StringBuilder();
        // Stack<Character> stack=new Stack<>();
        ArrayDeque<Character> stack =new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='('){
                stack.push(curr);
            }else if(curr==')'){
                while(stack.peek() !='('){
                    res.append(stack.pop());
                }
                stack.pop();
            }else if(isOperator(curr)){
                while(!stack.isEmpty() && precedence(curr)<=precedence(stack.peek())){
                    res.append(stack.pop());
                }
                stack.push(curr);
            }else{
                res.append(curr);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        // System.out.println(res);
        return res;
        
    }


    public static int calculate(int first,int second,char curr){
        switch(curr){
            case '+':return first+second;
            case '-':return first-second;
            case '*':return first*second;
            case '/':return first/second;
        }
        return 0;
    }
    
    public static int evaluation(StringBuilder str){
        Stack<Integer> stack =new Stack<>();

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);

             if(isOperator(curr)){
               int second=stack.pop();
               int first=stack.pop();
               int eval= calculate(first, second, curr); 
               stack.push(eval);
            }else{
                stack.push(curr-'0');
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        String str="(2+3)*4";
        StringBuilder res= new StringBuilder();
        res=InfixConvertPostfix(str);
        System.out.println(res);
        System.out.println(evaluation(res));

        // String temp="23";
        // char ch=temp.charAt(1);
        // System.out.println(ch-'5');
    }
}






////////////////////////////////////////   Our Code But have to correct  ////////////////////////
// class InfixToPostfix {

//     public static Boolean isOperator(char ch){
//         return ch=='+'||ch=='-'||ch=='*'||ch=='/'; 
//     }

//     public static int precedence(char ch){
//         if(ch=='+' || ch=='-'){
//             return 1;
//         }else if(ch=='*' || ch=='/') {
//             return 2;
//         }else{
//             return -1;
//         }
//     }


//     public static void postFix(String str){

//         StringBuilder res=new StringBuilder();
//         Stack<Character> stack=new Stack<>();

//         for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);

        
//             if(curr=='('){                             // (a*b)-(c/d-e+f)
//                 stack.push(curr);
//             }else if(curr==')'){     
//                 while(stack.peek() !='('){
//                     if(precedence(curr)<=precedence(stack.peek())){
//                         res.append(stack.pop());
//                     }
//                 }
//                 stack.pop();
//             }else if(isOperator(curr)){
//                 if(stack.isEmpty()){
//                     stack.push(curr);
//                 }
//                 if(precedence(curr)<=precedence(stack.peek())){
//                     res.append(stack.pop());
//                     stack.push(curr);
//                 }
//                 stack.push(curr);
//             }else{
//                 res.append(curr);
//             }
//         }

//         while(!stack.isEmpty()){
//             res.append(stack.pop());
//         }

//         System.out.println(res);
//     }


//     public static void main(String[] args) {

//         String input="(a*b)-(c/d-e+f)";

//         postFix(input);
        
//     }
// }

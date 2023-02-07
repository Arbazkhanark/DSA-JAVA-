package NewDataStructure.Collection.Hashing__HashMap.Stack.StackProblems;

import java.util.ArrayDeque;

public class ValidParenthesis {

    public static Boolean isValid(String str){

        ArrayDeque<Character> stack =new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='{' || curr=='[' || curr=='('){
                stack.push(curr);
                continue;
            }

            // int head=stack.pop();
            char head='a';
            switch(curr){
                case '}':head=stack.pop();
                if(head!='{')return false;
                break;

                case ']':head=stack.pop();
                if(head!='[')return false;
                break;

                case ')':head=stack.pop();
                if(head!='(')return false;

            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        
        String str="{a(a-b)(i}";    //False
        String str1="{a(a-b)(i)}";  // True

        System.out.println(isValid(str));
    }
}

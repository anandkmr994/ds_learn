package com.ds.stack;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class InfixToPostfix {
    public static String postfix(String infixExpression) {
        if(null == infixExpression || infixExpression.isEmpty() || "".equalsIgnoreCase(infixExpression)){
            System.out.println("invalid infix expression");
            return null;
        }

        Stack<Character> stack = new Stack<Character>();
        String result = "";

        for(int i = 0 ; i < infixExpression.length() ; i++){
            char c = infixExpression.charAt(i);

            if(Character.isLetterOrDigit(c))
                result += c;

            else if(c == '(')
                stack.push('(');

            else if (c == ')'){
                while(!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                if(!stack.isEmpty() && stack.peek() != '(')
                    return "invalid expression";
                stack.pop();
            }

            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }
    public static int precedence(char i){
        switch (i){
            case '+' :
            case '-' :
                return 1 ;

            case '*' :
            case '/' :
                return 2 ;

            case '^' :
                return 3 ;
        }
        return -1 ;
    }
    public static void main(String[] args) {
        System.out.println("infix : " + "a+b*(c^d-e)^(f+g*h)-i" + " is converted to postfix" +
                " : " + postfix("a+b*(c^d-e)^(f+g*h)-i"));
        System.out.println("infix : " + " " + " is converted to postfix" +
                " : " + postfix(" "));
    }
}

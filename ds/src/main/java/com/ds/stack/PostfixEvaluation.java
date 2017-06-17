package com.ds.stack;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class PostfixEvaluation {
    public static int evaluate(String postfixExpression) {

        if(null == postfixExpression || postfixExpression.isEmpty() || "".equalsIgnoreCase(postfixExpression)){
            System.out.println("invalid postfix expression");
            return -1;
        }
        Stack<String> stack = new Stack<String>();
        String[] tokensArray = postfixExpression.split(" ");
        String token = null;
        int operand1=0,operand2=0 ;
        for(int i = 0 ; i < tokensArray.length ; i++){
            token = tokensArray[i];

            if(Character.isLetterOrDigit(token.charAt(0)))
                stack.push(token);

            else{
                if(stack.isEmpty()) {
                    System.out.println("invalid postfix expression");
                    return -1;
                }

                operand1 = Integer.parseInt(stack.pop()) ;

                if(stack.isEmpty()) {
                    System.out.println("invalid postfix expression");
                    return -1;
                }

                operand2 = Integer.parseInt(stack.pop());

                switch (token)
                {
                    case "+": stack.push("" + (operand2 + operand1)); break;
                    case "-": stack.push("" + (operand2 - operand1)); break;
                    case "*": stack.push("" + (operand2 * operand1)); break;
                    case "/": stack.push("" + (operand2 / operand1)); break;
                }
            }
        }
        if(stack.isEmpty() || stack.size()>1){
            System.out.println("invalid postfix expression");
            return -1;
        }
        return Integer.parseInt(stack.pop());
    }
    public static void main(String[] args) {
        System.out.println("postfix expression : 2 3 1 * + 9 -    evaluated to : " +
                "" + evaluate("2 3 1 * + 9 -") );

        System.out.println("postfix expression : 23 2 *    evaluated to : " +
                "" + evaluate("23 2 * ") );
    }
}

package com.ds.hackerRank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by anandkumar on 2/7/17.
 */
public class QueueWith2Stack {
    static Stack<Integer> mainStack = new Stack<Integer>();
    static Stack<Integer> auxStack = new Stack<Integer>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int queries = 0,quesType = 0,element = 0,result = 0 ;
        queries = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < queries ; i++){
            quesType = sc.nextInt();
            switch(quesType){
                case 1 : {
                    element = sc.nextInt();
                    enqueue(element);
                    break;
                }
                case 2 : {
                    dequeue(2);
                    break;
                }
                case 3 : {
                    result = dequeue(3);
                    System.out.println(result);
                    break;
                }
            }
        }
    }

    public static void enqueue(int x){
        mainStack.push(x);
    }

    public static int dequeue(int query){
        if(mainStack.isEmpty()&&auxStack.isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        if(auxStack.isEmpty()) {
            while (!mainStack.isEmpty()) {
                auxStack.push(mainStack.pop());
            }
        }
        int result = auxStack.peek();
        if(query==2){
            auxStack.pop();
        }
        return result ;
    }

}

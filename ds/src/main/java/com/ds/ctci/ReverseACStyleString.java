package com.ds.ctci;

/**
 * Created by anandkumar on 14/7/17.
 */

/*
Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
five characters, including the null character.)
 */
public class ReverseACStyleString {
    public static char[] reverse(char[] a) {
        if(a == null){
            System.out.println("null string");
            new Exception("null string");
        }
        if(a.length == 0){
            System.out.println("empty string");
            new Exception("empty string");
        }

        int length = a.length;
        int i = 0 , j = length-2 ;
        char temp ;

        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp ;
            i++;
            j--;
        }
        return a;
    }

    public static void print(char[] a) {
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        char[] a = new char[]{'a','b','c','d','n'};
        System.out.println("string before reversal");
        print(a);
        reverse(a);
        System.out.println("string after reversal");
        print(a);
    }
}

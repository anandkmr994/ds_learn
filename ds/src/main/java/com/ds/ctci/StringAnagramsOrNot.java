package com.ds.ctci;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anandkumar on 14/7/17.
 */
public class StringAnagramsOrNot {
    public static boolean isAnagram(String s1, String s2) {
        if(s1 == null && s2 == null){
            System.out.println("null string are not anagrams ");
            return  false ;
        }
        if(s1 == null || s2 == null){
            System.out.println("not anagrams");
            return false ;
        }
        if(s1.length() == s2.length() && s1.length() == 0){
            System.out.println("empty strings are anagrams");
            return true ;
        }
        if(s1.length() != s2.length()){
            System.out.println("not anagrams");
            return false ;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int oldCount = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            if(map.containsKey(s1.charAt(i))){
                oldCount = map.get(s1.charAt(i));
                map.put(s1.charAt(i),oldCount+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }

        for(int i = 0 ; i < s2.length() ; i++){
            if(map.containsKey(s2.charAt(i))){
                oldCount = map.get(s2.charAt(i));
                if (oldCount ==1){
                    map.remove(s2.charAt(i));
                }else {
                    map.put(s2.charAt(i), oldCount - 1);
                }
            }else{
                System.out.println("not anagrams");
                return false ;
            }
        }
        return map.size() == 0;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram(null,null));
    }
}

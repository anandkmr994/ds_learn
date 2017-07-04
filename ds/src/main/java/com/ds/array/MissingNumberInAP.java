package com.ds.array;

/**
 * Created on 23/6/17.
 */
public class MissingNumberInAP {

    public static int findMissingNumber(int[] arr) {
        if(null == arr || arr.length <=1 ){
            System.out.println("not enough number of elements");
            return -1;
        }
        int diff = arr[1]-arr[0] ;
        int tempDiff = diff ;
        for(int i = 1; i < arr.length-1 ; i++){
            tempDiff = arr[i+1]-arr[i];
            if(tempDiff == diff*2){
                return arr[i]+diff ;
            }else if(tempDiff == diff/2){
                return arr[0]+tempDiff ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,10};
        System.out.println("missing number is : " + findMissingNumber(arr));
    }
}

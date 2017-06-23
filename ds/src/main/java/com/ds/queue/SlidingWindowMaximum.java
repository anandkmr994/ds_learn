package com.ds.queue;

import com.ds.dao.CustomQueue;

public class SlidingWindowMaximum {

	public static void printMax(int[] arr, int k){
		if(null == arr || arr.length == 0){
			System.out.println("empty array");
			return ;
		}
		if(k<=0){
			return ;
		}
		int i ;
		CustomQueue<Integer> queue = new CustomQueue<Integer>();
		for(i = 0 ; i < k ;i++){
			while((!queue.isEmpty()) && arr[queue.rear()]<=arr[i]){
				queue.dequeueRear();
			}
			queue.enqueue(i);
		}
		for(; i < arr.length ; i++){
			System.out.println(arr[queue.front()]);
			
			while(!queue.isEmpty() && queue.front()<=i-k){
				queue.dequeue();
			}
			while(!queue.isEmpty() && arr[queue.rear()]<=arr[i]){
				queue.dequeueRear();
			}
			queue.enqueue(i);
		}
		System.out.println(arr[queue.front()]);
	}
	public static void main(String[] args) {
		int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56};
		printMax(arr, 3);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds.queue;

/**
 *
 * @author anandkumar
 */
public class CircularTourPatrolPumps {
	
	public static void tour(PatrolPump[] arr) {
		if(null == arr || arr.length == 0){
			System.out.println("empty array");
			return ;
		}
		
		int tourStart = 0, tourEnd = 0 ;
		
		int distanceCovered = arr[0].patrol-arr[0].distanceToGo;
		int coveredPoints = 1 ;
		
		while(true){
			while(distanceCovered <0){
				tourStart++;
				coveredPoints--;
			}
			
		}
	}
    public static void main(String[] args){
        
    }
    
    
    
    
    class PatrolPump{
		int patrol ;
		int distanceToGo ;
		public PatrolPump(int patrol, int distanceToGo) {
			super();
			this.patrol = patrol;
			this.distanceToGo = distanceToGo;
		}
	}
}

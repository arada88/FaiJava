package com.buzzfreeze.helloWorld;

public class Array {
     public static void main(String[] args) {
    	 int[][] twoD_Array = {{1,2,3},{4,5,6,7},{8,9}
    	 };
    	 
    	for(int[]row: twoD_Array) {
    		for(int element: row) {
    			System.out.println(element);
    		}
    	}
     };
     //public static void printArray(int[] _array) {
    	// for (int item: _array) {
    		// System.out.println(item);
    	// }
    // }
}

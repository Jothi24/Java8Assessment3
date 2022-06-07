package com.JavaStream;

import java.util.Arrays;


public class MinAndMaxElement {

	public static void main(String[] args) {
		
		int[] A= { 6, 8, 3, 5, 1, 9 };
		
		int max = Arrays.stream(A).max().getAsInt();
		int min = Arrays.stream(A).min().getAsInt();
		
		System.out.println("Min element is " + min);
	    System.out.println("Max element is " + max);
	    
	}
	
}
		
			
        


	
	

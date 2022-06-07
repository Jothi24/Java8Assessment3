package com.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDulicateElement {
	
	public static void  main(String[] args) {
		
	List<Integer> list =Arrays.asList (4,5,7,8,99,100,101,33,32,4,4);
	
	List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
	
	System.out.println("Array with duplicate removed: "+ newList);
	
	
	}

}



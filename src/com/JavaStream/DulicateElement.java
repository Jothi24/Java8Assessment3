package com.JavaStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DulicateElement {
	
	public static void main(String[] args) {
		
	
	List<Integer> list= Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
	Set<Integer> set = new HashSet<>();
	list.stream().filter(n-> !set.add(n)).forEach(System.out::println);
	
	
	}
	
}

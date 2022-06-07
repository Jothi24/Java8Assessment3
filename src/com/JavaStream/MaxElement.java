package com.JavaStream;

import java.util.Arrays;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,90,350,5);
		
		Integer l = list.stream().max(Integer::compare).get();
		System.out.println("The Maximum element is: "+ l);

	}

}

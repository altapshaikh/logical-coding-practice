package com.learnbyheart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementInArray {

	public static void main(String[] args) {
		// first array
		Integer array1[] = { 2, 4, 5, 6, 7, 8, 9 };
//second array
		Integer array2[] = { 2, 44, 55, 6, 77, 8, 29 };
//second array
		Integer array3[] = { 2, 44, 55, 66, 77, 8, 29 };
		//convert 2 array to list
		List<Integer> asList = Arrays.asList(array2);
		//convert 3 array to list
		List<Integer> asList1 = Arrays.asList(array3);

		List<Integer> collect = Arrays.stream(array1).filter(asList::contains).collect(Collectors.toList());

		List<Integer> collect2 = collect.stream().filter(asList1::contains).collect(Collectors.toList());

		System.out.println(collect2);
System.out.println("========================================================>");
	}

}

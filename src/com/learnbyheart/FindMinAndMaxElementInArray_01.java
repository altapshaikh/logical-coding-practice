package com.learnbyheart;

import java.util.Arrays;

public class FindMinAndMaxElementInArray_01 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		int[] intArray = new int[] { 2, 7, 9, 5, 1, 3, 5 };
//printing the min element
int min = Arrays.stream(intArray).min().getAsInt();
//printing the max element
int max = Arrays.stream(intArray).max().getAsInt();
System.out.println("Max Element "+max+" Min Element "+min);
		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}

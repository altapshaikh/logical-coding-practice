package com.learnbyheart;

import java.util.Arrays;
import java.util.Collections;

public class FindMinAndMaxElementInArray_02 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		Integer[] intArray = new Integer[] { 2, 7, 9, 5, 1, 3, 5 };
		int min = Collections.min(Arrays.asList(intArray));

		int max = Collections.max(Arrays.asList(intArray));

		System.out.println("Max Element " + max + " Min Element " + min);
		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}

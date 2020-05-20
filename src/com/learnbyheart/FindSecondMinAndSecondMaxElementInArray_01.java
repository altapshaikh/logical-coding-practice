package com.learnbyheart;

import java.util.Arrays;

public class FindSecondMinAndSecondMaxElementInArray_01 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");

		int array[] = { 10, 20, 25, 63, 96, 57 };
	
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[1];
		System.out.println("2nd smallest element is ::" + res);
	
		int max = array[array.length-2];
		System.out.println("2nd largest element is ::" + max);
	}
}

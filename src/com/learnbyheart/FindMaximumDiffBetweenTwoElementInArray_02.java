package com.learnbyheart;

public class FindMaximumDiffBetweenTwoElementInArray_02 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		int[] intArray = new int[] { 2, 7, 9, 5, 1, 3, 5 };

		int diff = Integer.MIN_VALUE;
		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				diff=Integer.max(diff,intArray[i]=intArray[j]);
			}
		}
System.out.println(diff);
		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}

package com.learnbyheart;

public class FindDuplicateElementInArray_01 {

	public static void main(String[] args) {
	
		System.out.println("===START======>"+System.currentTimeMillis()+"==========>");
		int[] intArray = new int[] { 4, 5, 6, 7, 8, 4, 6, 7 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i);
			for (int j = i + 1; j < intArray.length; j++) {
				System.out.println(j);
				if (intArray[i] == intArray[j]) {
              System.out.println("DUPLICATE ELEMNT IN ARRAY "+intArray[i]);
				}
			}
		}
		System.out.println("====STOP=====>"+System.currentTimeMillis()+"==========>");
	}
}

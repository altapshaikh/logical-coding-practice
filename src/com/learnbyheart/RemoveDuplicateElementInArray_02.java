package com.learnbyheart;

import java.util.Arrays;

public class RemoveDuplicateElementInArray_02 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		Integer[] intArray = new Integer[] { 4, 5, 6, 7, 8, 4, 6, 7 };

		// this array has duplicate element
		System.out.println(Arrays.toString(intArray));
		
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]==intArray[j]) {
					intArray[j] = null;
				}
			}		
		}
		// this array has without duplicate element
		System.out.println("after remove "+Arrays.toString(intArray));
		

		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}

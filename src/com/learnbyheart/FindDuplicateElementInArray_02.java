package com.learnbyheart;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray_02 {

	public static void main(String[] args) {
		
		System.out.println("===START======>"+System.currentTimeMillis()+"==========>");
		int[] intArray = new int[] { 4, 5, 6, 7, 8, 4, 6, 7 };
		
		Set<Integer>set=new HashSet<Integer>();
		
		for(int arr:intArray) {
			
			if(set.add(arr)==false) {
				   System.out.println("DUPLICATE ELEMNT IN ARRAY "+arr);
				
			}
			
		}
		System.out.println("====STOP=====>"+System.currentTimeMillis()+"==========>");
	}
}

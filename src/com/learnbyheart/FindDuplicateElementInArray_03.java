package com.learnbyheart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementInArray_03 {

	public static void main(String[] args) {
		
		System.out.println("===START======>"+System.currentTimeMillis()+"==========>");
		int[] intArray = new int[] { 4, 5, 6, 7, 8, 4, 6, 7 };
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int arr :intArray) {
			Integer count = map.get(arr);
			if(count==null) {
				map.put(arr, 1);
			}else {
				map.put(arr, count++);
			}
			 Set<Entry<Integer, Integer>> entrySet = map.entrySet();
			 for (Entry<Integer, Integer> entry : entrySet) {
				 if (entry.getValue() > 1) {
				 System.out.printf("duplicate element '%s' and count '%d' :", entry.getKey(), entry.getValue());
				 }
			 }
		}
		

		

		System.out.println("====STOP=====>"+System.currentTimeMillis()+"==========>");
	}
}

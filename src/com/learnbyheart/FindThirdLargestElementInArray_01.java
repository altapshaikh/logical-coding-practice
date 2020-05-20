package com.learnbyheart;

public class FindThirdLargestElementInArray_01 {

	public static void main(String[] args) {

		System.out.println("===START======>" + System.currentTimeMillis() + "==========>");
		int[] intArray = new int[] {10, 20, 25, 63, 96, 57};
		int temp=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[i]>intArray[j]) {
					temp=intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
System.out.println("Third largest number is:: "+intArray[intArray.length-3]);

		System.out.println("====STOP=====>" + System.currentTimeMillis() + "==========>");
	}
}

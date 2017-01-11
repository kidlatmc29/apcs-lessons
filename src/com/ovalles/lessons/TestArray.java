package com.ovalles.lessons;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {

		int[] arr = new int[2]; 
		arr[0] = 1;
		arr[1] = 29;
		System.out.println("arr is " + Arrays.toString(arr));
		
		int size = arr.length;
		String[] textMe = {"Dad","is","a","butt"};
		System.out.println("textMe is " + Arrays.toString(textMe));
		
		
	}
	

}

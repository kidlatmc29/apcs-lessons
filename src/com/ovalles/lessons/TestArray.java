package com.ovalles.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {

	public static void main(String[] args) {

		int[] arr = new int[2]; 
		arr[0] = 1;
		arr[1] = 29;
		System.out.println("arr is " + Arrays.toString(arr));
		
		int size = arr.length;
		String[] textMe = {"Dad","is","a","butt"};
		System.out.println("textMe is " + Arrays.toString(textMe));
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		numbers.add(123);
		numbers.add(666);
		numbers.add(456);
		int butt = numbers.get(0);
		Integer biggerButt = numbers.get(1);
		System.out.println("butt = " + butt + " " + "biggerButt = " + biggerButt);
		int result = Math.max(butt, biggerButt); 
		System.out.println("result = " + result);
		if(biggerButt.equals(new Integer(butt))) {
			System.out.println("butt butt"); 
			}
		System.out.println(numbers); 
		numbers.remove(1);
		System.out.println(numbers);
		
		
		System.out.println("Printing array arr");
		System.out.println("print the object: " + arr); 
		System.out.println("print using Arrays.toString() " + Arrays.toString(arr));
		System.out.println("printing the hard way: ");
		for(int x : arr) {
			System.out.print(" " + x);
		}
		System.out.println();
		System.out.println("one at a time " + arr[0]);
		System.out.println("one at a time at 1 " + arr[1]);
		
		if(arr instanceof Object) {
			System.out.println("arr is an object.");
		}
		
		}
	}
	
	



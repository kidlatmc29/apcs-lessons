package com.ovalles.lessons;

public class MethodOverloading {
	public static void main(String[] args) {
		square(2);
		rectangle(2, 4);
		sum(2, 3);
		sum(1.5, 3.5);
	}
	
	public static void square(int side) {
		System.out.println("The area of the square is " + side * side);
	}
	public static void rectangle(int length, int width) {
		System.out.println("The area of the retangle is " + width * length);
	}
	public static void sum(int x, int y) {
		System.out.println("The sum is " + (x + y));
	}
	public static void sum(double x, double y) {
		System.out.println("The sum is " + (x + y));
	}

}

package com.ovalles.lessons;

public class Triangle {
	
	private int a;
	private int b;
	private int c;
	
	Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b; 
		this.c = c;
		
	} 
	
	public static void main(String[] args) {
		Triangle x = new Triangle(5, 32, 5);
		System.out.println("Triangle has " + x.equalSides() + " equal sides.");
		Triangle y = new Triangle(14, 14, 14);
		
		System.out.println(x.equals(y));
		
		System.out.println("Triangle has " + y.equalSides() + " equal sides.");
		Triangle z = new Triangle(14, 15, 16);
		System.out.println("Triangle has " + z.equalSides() + " equal sides.");
		Triangle e = new Triangle(5, 5, 23);
		System.out.println("Triangle has " + e.equalSides() + " equal sides.");
		Triangle w = new Triangle(23, 3, 3);
		System.out.println("Triangle has " + w.equalSides() + " equal sides.");
		
	}

	public int equalSides() {
		if(a == b && b == c) {
			return 3;
		} else if(a == b || b == c || c == a) {
			return 2;
		} 
		return 0;
	}

}

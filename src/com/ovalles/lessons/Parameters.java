package com.ovalles.lessons;

public class Parameters {

	public static void main(String[] args) {
		//printString("Hello", 4);
		//myMathPow(2);
		moreMathPow(4, 3);
	}
	
	public static void printString(String printThis, int numberPrint) {
		for (int i = numberPrint; i > 0; i--) {
			System.out.print(printThis + " ");
		}
		System.out.println();
	}
	
	public static void myMathPow(int base) {
		int result = 0;
		for (int j = 1; j <= base; j++) {
				result = (int) Math.pow(base, j);
				System.out.print(result + " ");
		}
	}
	
	public static void moreMathPow(int base, int pow) {
		for (int j = 0; j <= pow; j++) {
			System.out.print(((int) Math.pow(base, j) + " ")); 
		}
	}

}

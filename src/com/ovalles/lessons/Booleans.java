package com.ovalles.lessons;

public class Booleans {
	public static void main(String arg []) {
		isPowerOfTwo(64);
	}
	
	public static boolean isPowerOfTwo (int num) {
		boolean isPowerOfTwo = true;
		if (num == 0) {
			System.out.print(isPowerOfTwo);
			return isPowerOfTwo;
		}
		while (num != 1) {
			num = num / 2;
			if (num == 0) {
				break;
			}
			if (num == 1) {
				System.out.println(isPowerOfTwo);
				return isPowerOfTwo;
			}
		}
		isPowerOfTwo = false;
		System.out.println(isPowerOfTwo);
		return isPowerOfTwo;
		
	}

}

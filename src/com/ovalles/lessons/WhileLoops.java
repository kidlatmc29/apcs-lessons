package com.ovalles.lessons;
import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = console.nextInt();
		System.out.print("Please enter n or p: ");
		String plusOrMinus = console.next();
		
		while (plusOrMinus.equals("n") || plusOrMinus.equals("p")) {
			if (plusOrMinus.equals("n")) {
				num = num + 1;
				System.out.println(num);
			} else {
				num = num - 1;
				System.out.println(num);
			}
			System.out.print("Enter a n or p again or not, your choice...");
			plusOrMinus = console.next();
		}
		System.out.println("Byeeeeee~");
		
	}
	
}

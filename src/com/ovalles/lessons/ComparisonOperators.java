package com.ovalles.lessons;
import java.util.Scanner;


public class ComparisonOperators {
	public static void main(String[] args) {
		 printFactorial();
		}


		public static void printFive() {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			
		}
		
		public static void printStrings() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter an interger:");
			int number = console.nextInt();


				for (int i = number; i > 0; i--) {
					System.out.println("Hello!");
				}
		}
		
		public static void asciiArt() {
			for (int i = 4; i > 0; i --) {
				System.out.println("  *");
				System.out.println(" * *");
				System.out.println("*   *");
			}
		}


		public static void printSum() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter an interger: ");
			int number = console.nextInt();
			
			int sum = 0;
			
				for (int i = number; i > 0; i--) {
				Scanner moreInts = new Scanner(System.in);
				System.out.println("Please enter another integer: ");
				int sumOfInts = moreInts.nextInt();
				sum += sumOfInts; 
				}
				System.out.println("The sum of these intergers are: " + sum);
				console.close();
		}


		public static void printFactorial() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter an interger to figure out the factorial: ");
			int input = console.nextInt(); 
			double result = 1; // int and long is too small for three digit factorials
			
			for (int i = input; i > 0; i--) {
				result = result * i;		
			}
			
			System.out.println("The factorials of " + input + " = " + result);
		}

}

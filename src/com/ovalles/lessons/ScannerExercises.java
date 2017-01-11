package com.ovalles.lessons;
import java.util.Scanner;
public class ScannerExercises {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		processName(scanner); 
		
		/* 
		System.out.println("Finds the roots of a quadratic equation: a*(x*x) + (b*x) + c = 0");
		System.out.println("Please enter a, b, and c: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double x = findRoot(a, b, c); 
		*/
	
		//scannerTest(); 
	}
	
	public static void processName(Scanner scanner) {
		System.out.println("Please enter your first and last name:");
		String name = scanner.nextLine();
		String[] names = name.split("\\s+");


		System.out.print("Your name reverse is: ");
		for (int i = names.length - 1; i > -1; i--) {
			System.out.print(names[i].trim());
			if (i != 0)
				System.out.print(", ");
		}


		System.out.println();
		scanner.close();
	}


	public static void randomNumber() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter an interger:");
		int firstNumber = console.nextInt();
		System.out.println("Please enter a larger interger:");
		int secondNumber = console.nextInt(); 
		
		int randomNumber = (int) (Math.random() * (secondNumber - firstNumber)+ 1) + firstNumber;


		System.out.println("Here's a random number in this range: " + randomNumber); 
		console.close();
	}
	
	public static double findRoot(int a, int b, int c) {
		System.out.println("a = " + a + "," + " b = " + b + "," + " c = " + c);
		
	    if(a == 0) {
	    	System.out.println("a cannot be zero.");
	    	return 0;
	    }
		
		double y = b * b;
		double x = a * 2;
		double z = y - (4 * a * c);
		double squared = Math.sqrt(z); 
		 
		double result = ((b * -1) + squared) / x; 
		System.out.println("Result 1:  " + result);
		double resultTwo = ((b * - 1) - squared) / x; 
		System.out.println("Result 2: " + resultTwo);
		return result; 
	
	}
	
	public static void scannerTest() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = console.nextInt();
		console.nextLine();
		System.out.println("Enter your full name");
		String name = console.nextLine();
		System.out.println(age + " - " + name);
	}

}

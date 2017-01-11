package com.ovalles.lessons;
import java.util.Scanner;

public class ConversionsAndOperators {
	/*
	  * Exercise 2: Write a Java program that accepts user input of an integer (0 through 25) 
	  * and prints the number and the “alpha-index” using the scale A=0, B=1, … , Z = 25.  
	  * Use casting and char for the conversion.
	  */

		public static void main(String[] args) {
			/*System.out.println((char) 49);
			System.out.println('a' + 1);
			System.out.println((char)('a' + 1));
			System.out.println('a' + 1.0);
			System.out.println('a' + " = a");
			System.out.println('c' - 'a');
			System.out.println('a' - 'A');
			System.out.println('a' > 'b');
			System.out.println('a' > 'B');
			//System.out.println((char) "a");
			System.out.println("=======================================================");
			System.out.println();
			*/
			
			//intToChar();
			
			System.out.println("Your pay for the week is: $" + employeePay());
		}
		
		public static void intToChar() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter an interger: ");
			int number = console.nextInt(); 
			number += 65;
			System.out.println(((char) number) + " = " + number);
			
			console.close();
		}	
		
		public static void veryLongIntToChar() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter a six digit interger: ");
			String number = console.nextLine();
			String first = number.substring(0, 3);
			String second = number.substring(3, 6);
			char charFirst = (char) Integer.parseInt(first);
			char charSecond = (char) Integer.parseInt(second);
			
			System.out.println("First = " + charFirst);
			System.out.println("Second = "  + charSecond);
			
			
		}
		
		public static double employeePay() {
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter the hours you worked from Monday to Friday: ");
			int hoursWorked = console.nextInt();
			hoursWorked += console.nextInt();
			hoursWorked += console.nextInt();
			hoursWorked += console.nextInt();
			hoursWorked += console.nextInt();
			console.close();
			
			double grossPay = (hoursWorked * 12.50); 
			
			double totalPay = grossPay -(grossPay * .27); 
			
			return totalPay;
			
		}

	
}

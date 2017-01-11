package com.ovalles.lessons;
import java.util.Scanner;

public class CompoundAssignments {
	public static void main(String[] args) {


		//exerciseFour();
		
		shoppingCart();
		
		/*int first = 8;
		int second = 19; 
		first += second; //first = 19 + 8 = 27
		System.out.println(second = second - first); // second = 27 - 8 = 19
		//first -=  second; //first = 27 - 19 = 8
		
		System.out.println("First should equal 19 = " + first);
		System.out.println("Second should equal 8 =  " + second);
		*/
	}
	
	
	public static void exerciseFour() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter 3 intergers: ");
		int x = console.nextInt();
		x += x; 
		x = console.nextInt();
		x += x;
		x = console.nextInt();
		x += x;
		
		x /= 3; 
		
		//adding all of the ints
		//x /= 3; dividing by 3 
		
		System.out.println("This is the average of those three numbers: " + x);
		
	}
	
	public static void shoppingCart() {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the prices of 5 items: ");
		double prices = console.nextDouble();
		prices += console.nextDouble();
		prices += console.nextDouble();
		prices += console.nextDouble();
		prices += console.nextDouble();
	
		
		prices +=  (prices * 0.1); //adding sales tax of 10%


		
		prices += 7.59; //adding shipping of $7.59
		
		System.out.println("Your total cost is: $" + prices);
		
		
	}

	
}

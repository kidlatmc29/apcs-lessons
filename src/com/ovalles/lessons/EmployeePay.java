package com.ovalles.lessons;

import java.util.Scanner; 

public class EmployeePay {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("Please input how many hours you worked on Monday through Friday:");
		int totalHours = console.nextInt(); //five times
		totalHours += console.nextInt(); 
		totalHours += console.nextInt(); 
		totalHours += console.nextInt();
		totalHours += console.nextInt(); 
		
		double pay = (totalHours * 12.50); 
		
		double totalPay = pay - (pay * .27); 
		
		System.out.print("$" + totalPay);
		

	}

}

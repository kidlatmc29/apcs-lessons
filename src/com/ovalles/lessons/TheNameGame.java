package com.ovalles.lessons;

import java.util.Scanner;

public class TheNameGame {
	static String firstName = "";
	static String lastName = "";
	public static void main(String[] args) {
	     Scanner console = new Scanner(System.in);
	     System.out.print("What is your name? ");
	     firstName = console.next(); 
	     lastName = console.next();
	     
	     System.out.println(firstName);
	     System.out.println(lastName);
	     
	    bName(firstName);
	     //System.out.println(name + " " + name + ", " + "bo-Bify");
	    fName(firstName);
	     // System.out.println("Banana-fana fo-" + name);
	    mName(firstName); 
	    //System.out.println("Fee-fi-mo-Miffy");
	    capName(firstName);
	    //System.out.println(name.toUpperCase() + "!");
	     bName(lastName);
	     //System.out.println(name + " " + name + ", " + "bo-Bent");
	    fName(lastName);
	     //System.out.println("Banana-fana fo-" + name);
	    mName(lastName); 
	    //System.out.println("Fee-fi-mo-Mvalles");
	    capName(lastName); 
	    //System.out.println(name.toUpperCase() + "!");
	     
	     

	}
	public static void bName(String name){
		String newName = "B" + name.substring(1);
		System.out.println(name + " " + name + ", " + "bo-" + newName);
	}
	
	public static void fName(String name) {
		String newName = "F" + name.substring(1);
		System.out.println("Banana-fana fo-" + newName);
	}
	
	public static void mName(String name) {
		String newName = "M" + name.substring(1);
		System.out.println("Fee-fi-mo-" + newName);
	}
	
	public static void capName(String name) {
		System.out.println(name.toUpperCase() + "!");
	}
	
}


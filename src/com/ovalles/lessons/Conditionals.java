package com.ovalles.lessons;

public class Conditionals {
	public static void main(String[] args) {
		grade(98);
		whatPeriod(900, "Saturday");
	}


	public static void grade(int percent) {
		if (percent >= 90) {
			System.out.println("You get an A!");
		}
		else if (percent >= 80) {
			System.out.println("You get a B!");
		}
		else if (percent >= 70) {
			System.out.println("You get a C!");
		}
		else if (percent >= 60) {
			System.out.println("You get a D!");
		}
		else if (percent <= 50) {
			System.out.println("You get an F!");
		}
	   }
	
	public static String whatPeriod(int time, String day) {
		String period = "";
		if ((day == "Saturday") || (day == "Sunday")) {
			period = ("No classes today!");
		} 
		else if (time >= 830) {
			period = ("AP computer science!");
		}
		else if (time >= 925) {
			period = ("Spanish 2!");
		}
		else if (time >= 1025) {
			period = ("Algebra 2!");
		}
		else if (time >= 1115) {
			period = ("Lunch!");
		}
		else if (time >= 1155) {
			period = ("Chemistry!");
		}
		else if (time >= 1250) {
			period = ("Orchestra!");
		}
		else if (time >= 1345) {
			period = ("English!");
		} else {
			period = ("AP Wold History!");
		}
		System.out.println(period);
		return period;
		
	}



}

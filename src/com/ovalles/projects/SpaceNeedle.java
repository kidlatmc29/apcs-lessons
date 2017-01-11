package com.ovalles.projects;

import java.util.Scanner;

//Isabel  Ovalles 
//Period 1 APCS
// 10/12 - 10/14
//Hours logged on this project- 6 hour 
//Unit 2

public class SpaceNeedle {

	public static void main(String[] args) {
		String spaceNeedle = "";

		Scanner console = new Scanner(System.in);
		System.out
				.println("Hello! Please enter an intger greater than or equal to 2:");
		int size = console.nextInt();
		console.close();

		// Building the needle, space = size * 3
		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <= (size * 3); k++)
				spaceNeedle += " ";
			spaceNeedle += "||\n";
		}

		// Build top "hat"
		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <= (size * 3) - (i * 3); k++)
				spaceNeedle += " ";

			spaceNeedle += "__/";

			for (int k = 0; k < ((i - 1) * 3); k++)
				spaceNeedle += ":";
			spaceNeedle += "||";

			for (int k = 0; k < ((i - 1) * 3); k++)
				spaceNeedle += ":";
			spaceNeedle += "\\__\n";

		}

		// Build the "" line
		spaceNeedle += "|";
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < 6; k++) {
				spaceNeedle += "\"";
			}
		}
		spaceNeedle += "|\n";

		// Build bottom half of "hat"
		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <= (i * 2 - 2); k++)
				spaceNeedle += " ";

			spaceNeedle += "\\_/";
			for (int k = 1; k <= ((size * 3) - (2 * i)); k++) {
				spaceNeedle += "\\/";

			}
			spaceNeedle += "\\_/\n";
		}

		// Build the middle
		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <= (size * 3); k++)
				spaceNeedle += " ";
			spaceNeedle += "||\n";
		}

		for (int i = 1; i <= size * size; i++) {
			for (int k = 1; k <= (size * 3) - (size - 1); k++)
				spaceNeedle += " ";

			for (int j = 0; j < 2; j++) {
				spaceNeedle += "|";
				for (int k = 0; k < size - 2; k++)
					spaceNeedle += "%";
				spaceNeedle += "|";
			}
			spaceNeedle += "\n";
		}

		// Build the base

		for (int i = 1; i <= size; i++) {
			for (int k = 1; k <= (size * 3) - (i * 3); k++)
				spaceNeedle += " ";

			spaceNeedle += "__/";

			for (int k = 0; k < ((i - 1) * 3); k++)
				spaceNeedle += ":";
			spaceNeedle += "||";

			for (int k = 0; k < ((i - 1) * 3); k++)
				spaceNeedle += ":";
			spaceNeedle += "\\__\n";

		}

		spaceNeedle += "|";
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < 6; k++) {
				spaceNeedle += "\"";
			}
		}
		spaceNeedle += "|\n";
		System.out.println(spaceNeedle);
		System.out.println(spaceNeedle.hashCode());
	}

}
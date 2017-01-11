package com.ovalles.lessons;

public class ClassConstants {
	static final int SIZE = 3;


	public static void main(String args[]) {
		
		int topRow = SIZE; 
		int bottomRow = SIZE;
		int width = SIZE * SIZE + (SIZE % 2);
		
		
		//Prints out top line
		System.out.print("#");
		for (int top = 0; top < width; top++) {
			System.out.print("=");
		}
		System.out.println("#");
		
		
		//Prints out left side of the mirror
		//Prints out top spaces and <> 
		for (int row = 0; row < topRow; row++) {
			System.out.print("|");
			int dots = (SIZE * row);
			int spaces = ((width - 4) - dots)/2;
			
			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			
			System.out.print("<>");
			//Prints out top left side .
			for (int i = 0; i < dots; i++) {
				System.out.print(".");
			}
			System.out.print("<>");
			
			spaces = spaces + (dots % 2);
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		


		//Prints out bottom spaces and <>
		for (int row = bottomRow; row > 0; row--) {
			System.out.print("|");
			int dots = (row - 1) * SIZE;
			int spaces = ((width - 4) - dots)/2;
			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			//Prints out bottom left .
			for (int i = 0; i < dots; i++) {
				System.out.print(".");
			}
			System.out.print("<>");
			
			spaces = spaces + (dots % 2);
			for (int j= 0; j < spaces; j++) {
				System.out.print(" ");
			}
			
			
			System.out.print("|");
			System.out.println();
		}
		
		//Prints out last line
		System.out.print("#");
		for (int bottom = 0; bottom < width; bottom++) {
			System.out.print("=");
		}
		System.out.println("#");
		
	}
}

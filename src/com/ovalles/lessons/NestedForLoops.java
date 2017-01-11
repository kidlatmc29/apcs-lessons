package com.ovalles.lessons;

public class NestedForLoops {

	public static void main(String[] args) {
		//printNumbers();
		recDiamond();
}


	public static void printNumbers() {
		for (int row = 0; row < 6; row++) {
				for (int number = 0; number < 10; number++) {
					System.out.print(number);
				}
			}
		}
	
	public static void pyramidNumbers() {
		// outer loop is for the rows of numbers
		// inner loop is for how many numbers is printed in the row
		for (int row = 1; row <= 5; row++) {
			for (int numberInRow = 1; numberInRow <= row; numberInRow++) {
				System.out.print(row);
			}
			System.out.println();


		}
	}
	
	public static void reversePyramidNumbers() {
		// outer loop is for the rows of numbers
		// inner loop is for how many numbers is printed in the row
		for (int row = 5; row <= 1; row--) {
			for (int numberInRow = 1; numberInRow <= row; numberInRow--) {
				System.out.print(row);
			}
			System.out.println();


		}
	}
	
	public static void Slashfigure() {
		for (int row = 0; row < 6; row++) {
			for (int bSlashes = 0; bSlashes < row * 2; bSlashes++) {
				System.out.print("\\");
			}
			for (int charInRow = 0; charInRow < 22 - (4 * row); charInRow++) {
				System.out.print("!");
			}
			for (int fSlashes = 0; fSlashes < row * 2; fSlashes++) {
				System.out.print("/");
			}


			System.out.println();
		}
	}
	public static void multiplcation() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++){
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}


	public static void nestedLoops() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 - i; j++){
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void dollarTriangle() {
		int row = 0;
		for (row = 0; row < 7; row++) {
			int frontStars = (row * 2);
			int frontDollars = (7 - row);
			int middleStars = 14 - frontStars;
			int backDollars = frontDollars;
			int backStars = frontStars;
			
			for (int i = 0; i < frontStars; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < frontDollars; i++){
				System.out.print("$");
			}
	    	for (int i = 0; i < middleStars; i++) {
	            System.out.print("*");
	    	}
	    	for (int i = 0; i < backDollars; i++){
	    		System.out.print("$");
	    	}
	    	for (int i = 0; i < backStars; i++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
		}
	}


	
	public static void recDiamond() {
		System.out.println("+---------+");
		int numberOfFSlashes = 0;
		int numberOfBSlashes = 0;


		int numberOfFrontSpaces = 0;
		int numberOfBackSpaces = 0;


		int row = 0;
		
		int numFrontPipes = 1;
		int numBackPipes = numFrontPipes;
		int numberOfStars = 1;
 
		int height = 3;
		// top
		for (row = 0; row < height; row++) {
		


			numberOfFSlashes = row;
			numberOfBSlashes = numberOfFSlashes;


			numberOfFrontSpaces = 4 - numberOfFSlashes;
			numberOfBackSpaces = numberOfFrontSpaces;


			for (int i = 0; i < numFrontPipes; i++) {
				System.out.print("|");
			}


			for (int i = 0; i < numberOfFrontSpaces; i++) {
				System.out.print(" ");
			}


			for (int i = 0; i < numberOfFSlashes; i++) {
				System.out.print("/");
			}


			for (int i = 0; i < numberOfStars; i++) {
				System.out.print("*");
			}


			for (int i = 0; i < numberOfBSlashes; i++) {
				System.out.print("\\");
			}


			for (int i = 0; i < numberOfBackSpaces; i++) {
				System.out.print(" ");
			}


			for (int i = 0; i < numBackPipes; i++) {
				System.out.print("|");
			}
			
			System.out.println();
		}
		
		// bottom
		for(row = height; row > 0; row--) {


			numberOfFSlashes = row-1;
			numberOfBSlashes = numberOfFSlashes;


			numberOfFrontSpaces = 4 - numberOfFSlashes;
			numberOfBackSpaces = numberOfFrontSpaces;
			


			for (int i = 0; i < numFrontPipes; i++) {
				System.out.print("|");
			}


			for (int i = 0; i < numberOfFrontSpaces; i++) {
				System.out.print(" ");
			}


			for (int i = 0; i < numberOfFSlashes; i++) {
				System.out.print("\\");
			}


			for (int i = 0; i < numberOfStars; i++) {
				System.out.print("*");
			}


			for (int i = 0; i < numberOfBSlashes; i++) {
				System.out.print("/");
			}


			for (int i = 0; i < numberOfBackSpaces; i++) {
				System.out.print(" ");
			}


			for (int i = 0; i < numBackPipes; i++) {
				System.out.print("|");
			}
			
			System.out.println();	
		}
		
		System.out.println("+---------+");
		
		
		String name = "Isabel Ovalles";
		String dog = "Fido Dog";
		System.out.println("hash code name = " + name.hashCode());
		System.out.println("hash code dog = " + dog.hashCode());
		
	}

}

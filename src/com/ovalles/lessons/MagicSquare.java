package com.ovalles.lessons;

import java.util.Arrays;

public class MagicSquare {

	public static void main(String[] args) {
		MagicSquare square = new MagicSquare();
		int[][] arr = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		square.isMagicSquare(arr);
	}

	public boolean isMagicSquare(int[][] array) {

		if (array.length == 1 || array.length == 0) {
			return true;
		}

		int width = array.length;
		int height = array[0].length;

		// Checks if number of rows equals number of columns
		if (!(width == height)) {
			return false;
		}

		// Checks if the number of rows is the same length
		for (int i = 0; i < width; i++) {
			if (array[0].length != array[i].length) {
				return false;
			}
		}

		// Checks sum of rows
		int[] sumRows = new int[array.length];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < height; col++) {
				sumRows[row] += array[row][col];
			}
		}

		System.out.println("sumRows = " + Arrays.toString(sumRows));

		for (int i = 0; i < sumRows.length - 1; i++) {
			if (sumRows[0] != sumRows[i]) {
				return false;
			}
		}

		// Checks sum of columns
		int[] sumCols = new int[width];
		for (int col = 0; col < width; col++) {
			for (int row = 0; row < height; row++) {
				sumCols[col] += array[row][col];
			}
		}

		System.out.println("sumCols = " + Arrays.toString(sumCols));

		for (int i = 0; i < sumCols.length - 1; i++) {
			if (sumCols[0] != sumCols[i]) {
				return false;
			}
		}

		// Checks sum of diagonal
		int sumRightDiagonal = 0;
		boolean equalD = false;
		for (int row = 0; row < width; row++) {
			for (int col = 0; col < height; col++) {
				if (row == col) {
					sumRightDiagonal += array[row][col];
				}
			}
		}

		System.out.println("sumRightD = " + sumRightDiagonal);

		int sumLeftDiagonal = 0;
		int startRow = 0;
		int startCol = width - 1;
		for (int row = 0; row < width; row++) {
			for (int col = 0; col < height; col++) {
				if (startRow == row && startCol == col) {
					sumLeftDiagonal += array[row][col];
					startRow++;
					startCol--;
				}
			}
		}
		System.out.println("sumLeftD = " + sumLeftDiagonal);

		System.out
				.println("isMagicSquare = "
						+ ((sumCols[0] == sumRows[0])
								&& (sumRows[0] == sumLeftDiagonal) && (sumLeftDiagonal == sumRightDiagonal)));

		return ((sumCols[0] == sumRows[0]) && (sumRows[0] == sumLeftDiagonal) && (sumLeftDiagonal == sumRightDiagonal));
	}
}

/**
Isabel Ovalles
AP CS - Period 1
Hours logged - 8 hours 
11/21/16
Unit 3
 **/
package com.ovalles.projects;

import java.util.Scanner;

public class GuessingGame {

	int upperBound;
	int oneGameGuesses = 0;
	int totalGamesPlayed = 0;
	int totalCorrectGamesPlayed = 0;
	int totalCorrectGuesses = 0;
	int lowestGuessCount = 0;
	int numberToGuess = 0;
	Scanner console = new Scanner(System.in);

	public static void main(String args[]) {
		GuessingGame game = new GuessingGame();
		boolean playAgain = true;

		while (playAgain) {
			game.getUpperBound();
			game.getRandomNumber();
			game.play();

			playAgain = game.askToPlayAgain();

			if (playAgain == false) {
				System.out.println("========================================");
				System.out.println("Summary-");
				System.out.println("Number of games played: "
						+ game.totalGamesPlayed);
				System.out
						.println("Average guess: "
								+ ((double) (game.totalCorrectGuesses) / game.totalCorrectGamesPlayed));
				System.out.println("Lowest amount of guess until correct: "
						+ game.lowestGuessCount);
				System.out.println("========================================");
			}
		}
	}

	private boolean askToPlayAgain() {
		boolean result;
		System.out.print("Do you want to play again? Yes or No? ");
		String playAgainStr = console.next();
		result = playAgainStr.trim().toLowerCase().equals("yes");
		return result;
	}

	private void play() {
		oneGameGuesses = 0;
		totalGamesPlayed++;
		boolean game_not_done = true;

		while (game_not_done) {
			System.out
					.print("Enter a guess between 0 and " + upperBound + ": ");
			int guessNum = console.nextInt();

			// Checks if guessed number is less than 0 in order to add to how
			// many guesses were made
			if (guessNum < 0) {
				game_not_done = false;
			} else {
				oneGameGuesses++;
			}

			// Checks if guessed number is equal to the number to guess
			if (guessNum == numberToGuess) {
				System.out.println("You are correct! The number was "
						+ numberToGuess + ".");
				System.out.println("Your number of guess was " + oneGameGuesses
						+ ".");

				// Saves lowest guess count
				// First if statement sets the lowestGuessCount for the first
				// game
				if (lowestGuessCount == 0) {
					lowestGuessCount = oneGameGuesses;
				} else if (lowestGuessCount > oneGameGuesses) {
					lowestGuessCount = oneGameGuesses;
				}
				totalCorrectGuesses += oneGameGuesses;
				totalCorrectGamesPlayed++;
				break;
			}

			// Checks if guessed number is less than 0 -> "gives up"
			if (guessNum < 0) {
				System.out.println("Better luck next time!");
				System.out.println("Your total number of guess was "
						+ oneGameGuesses + ".");
				break;
			}

			// Checks if guessed number is greater than the number to guess
			if (guessNum > numberToGuess) {
				System.out.println("Too high!");
			}
			// Checks if guessed number is less than the number to guess
			if (guessNum < numberToGuess) {
				System.out.println("Too low!");
			}
		}
	}

	public int getRandomNumber2(int upperBound) {
		return (int) (Math.random() * (upperBound + 1));
	}

	private void getRandomNumber() {
		numberToGuess = (int) (Math.random() * (upperBound + 1));
	}

	private void getUpperBound() {
		System.out
				.print("Please enter an upper bounds number, to start the game: ");
		upperBound = console.nextInt();

		// Makes sure user inputs an upperbounds or else game does not start
		while (upperBound < 0) {
			System.out.print("Please enter a positive upper bounds number: ");
			upperBound = console.nextInt();
		}
	}
}
package roshambo;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Roshambo rock = Roshambo.ROCK;
		// Roshambo paper = Roshambo.PAPER;
		// Roshambo scissors = Roshambo.SCISSORS;

		// create user as a human player
		System.out.println("Welcome to Roshambo Detroit! Let's play some ROCK, PAPER, SCISSORS!");
		String humanName = Validator.getString(scnr, "Please enter your first name: ");
		System.out.println("Welcome to Roshambo Detroit, " + humanName + "!-)");

		HumanPlayer human = new HumanPlayer(humanName, scnr);

		System.out.println("Now, who would you like to play?\n");
		int opponent = Validator.getInt(scnr, "Randy (1) or Rocky (2):", 1, 2);

		Player challenger;

		// creates challenger
		if (opponent == 1) {
			challenger = new RandomPlayer("Randy");
			System.out.println("Randy is ready! I hope that you are too...");

		} else {
			challenger = new RockPlayer("Rocky");
			System.out.println("Rocky is ready to \"ROCK\" your world!");
		}

		// game loop structure
		String cont = "y";

		do {

			playTheGame(human, challenger);
			// whoWon(whoWon);

			cont = Validator.getString(scnr, "Want to play again? y/n?");
		} while (cont.matches("[yY].*"));

		System.out.println("Thanks for stopping by Roshambo Detroit! Have a good one.");

		scnr.close();

	}

	private static void playTheGame(HumanPlayer human, Player challenger) {
		Roshambo input = human.generateRoshambo();
		Roshambo computerOutput = challenger.generateRoshambo();

		System.out.println(input);
		System.out.println(computerOutput);
		whoWon(input, computerOutput);
	}

	public static void whoWon(Roshambo input, Roshambo output) {

		if ((input == Roshambo.ROCK && output == Roshambo.ROCK) || (input == Roshambo.PAPER && output == Roshambo.PAPER)
				|| (input == Roshambo.SCISSORS && output == Roshambo.SCISSORS)) {
			System.out.println("TIE!");
		} else if ((input == Roshambo.PAPER && output == Roshambo.ROCK)
				|| (output == Roshambo.PAPER && input == Roshambo.ROCK)) {
			System.out.println(Roshambo.PAPER + " WINS!");
		} else if ((input == Roshambo.PAPER && output == Roshambo.SCISSORS)
				|| (output == Roshambo.PAPER && input == Roshambo.SCISSORS)) {
			System.out.println(Roshambo.SCISSORS + " WINS!");
		} else if ((input == Roshambo.SCISSORS && output == Roshambo.ROCK)
				|| (input == Roshambo.ROCK && output == Roshambo.SCISSORS)) {
			System.out.println(Roshambo.ROCK + " WINS!");
		}
	}
}

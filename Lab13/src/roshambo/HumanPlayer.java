package roshambo;

import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner scnr;

	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scnr, "Would you like to play rock, paper or scissors?",
				"rock|paper|scissors");
		if (choice.equals("rock")) {
			return Roshambo.ROCK;

		} else if (choice.equals("paper")) {
			return Roshambo.PAPER;

		} else {
			return Roshambo.SCISSORS;
		}
	}
}
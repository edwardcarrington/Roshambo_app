package roshambo;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		int rIndex = (int) (Math.random() * 3);
		// int random = ThreadLocalRandom.current().nextInt(1, 4);

		return Roshambo.values()[rIndex];
		//
		// switch (random) {
		// case 1:
		// return Roshambo.ROCK;
		// case 2:
		// return Roshambo.PAPER;
		// case 3:
		// return Roshambo.SCISSORS;
		// default:
		// return null;
	}
}

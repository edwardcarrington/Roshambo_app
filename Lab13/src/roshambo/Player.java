package roshambo;

public abstract class Player {

	private String name;

	// constructors (no return type and same name as the class
	public Player(String name) {
		this.name = name;
	}

	// getter (get name)
	public String getName() {
		return name;
	}

	// return one of ROCK, PAPER, SCISSORS
	public abstract Roshambo generateRoshambo();

	public String toString() {
		return "Player " + name;
	}

}

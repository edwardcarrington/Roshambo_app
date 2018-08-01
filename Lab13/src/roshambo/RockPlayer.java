package roshambo;

public class RockPlayer extends Player {

	// constructors have no return type (not even void)
	// rock player will always be "rock" no matter what
	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}

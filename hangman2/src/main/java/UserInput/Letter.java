package UserInput;

public class Letter extends Guess {
	
	private char letter;

	public Letter(String guess) {
		super(guess);
		letter = guess.charAt(0);
	}
	
	public char getLetter() {
		return letter;
	}

}

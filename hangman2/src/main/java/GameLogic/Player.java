package GameLogic;

public class Player {
	
	private int lives;
	private boolean win;
	
	public Player(int lives) {
		this.lives = lives;
		win = false;
	}
	
	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void playerWins() {
		win = true;
	}
	
	public boolean getWin() {
		return win;
	}
	
}

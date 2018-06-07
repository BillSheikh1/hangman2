package GameLogic;

import java.util.ArrayList;
import java.util.Random;

import TextFileReader.TextFileReader;
import UserInput.Guess;
import UserInput.Letter;
import UserInput.UserInput;
import UserInput.Word;

public class GameLogic {
	
	private UserInput input;
	private TextFileReader reader;
	private ArrayList<String> words;
	private String targetWord;
	private char[] targetArray;
	private int targetCounter;
	private int currentCounter;
	private Player player;
	private boolean gameEnd;
	
	private ArrayList<Guess> usedGuesses;
	
	public GameLogic() {
		input = new UserInput();
		player = new Player(9);
		gameEnd = false;
		reader = new TextFileReader();
		reader.produceWordList("wordsEn.txt");
		words = reader.getWordList();
		usedGuesses = new ArrayList<Guess>();
		targetCounter = targetArray.length;
	}
	
	public String getInput() {
		String input = "";
		//get user input
		return input;
	}
	
	public void run() {
		targetWord = pickRandomWord();
		targetArray = targetWord.toCharArray();
		while(!gameEnd) {
			guess(input.validateInput(getInput()));
		}
	}
	
	public void guess(Guess guess) {
		if((guess instanceof Word) && correctLength(guess)) {
			if(correctWord(guess)) {
				win();
			}
			else {
				if(usedGuesses.contains(guess)) {
					//Error word already used
				}
				else {
					usedGuesses.add(guess);
					decreaseLives();
				}
			}
		}
		else if(guess instanceof Letter) {
			if(usedGuesses.contains(guess)) {
				//Error letter already used
			}
			else {
				if(correctLetter(guess)) {
					Letter letter = (Letter) guess;
					revealLetter(letter.getLetter());
					if(currentCounter == targetCounter) {
						win();
					}
					else {
						usedGuesses.add(guess);
					}
				}
				else {
					decreaseLives();
				}
			}
		}
	}
	
	private boolean correctLength(Guess guess) {
		if((targetWord.length() == guess.getGuess().length())) {
			return true;
		}
		return false;
	}
	
	private boolean correctLetter(Guess guess) {
		Letter guessLetter = (Letter) guess;
		for(char letter : targetArray) {
			if(guessLetter.getLetter() == letter) {
				return true;
			}
		}
		return false;
	}
	
	public void revealLetter(char letter) {
		//reveal letter in the GUI for the user
		//Increase current counter for each letter revealed
	}

	private boolean correctWord(Guess guess) {
		if(targetWord.equals(guess.getGuess())) {
			return true;
		}
		return false;
	}

	public String pickRandomWord() {
		Random rand = new Random();
		int value = rand.nextInt(words.size());
		return words.get(value);
	}
	
	public String getTargetWord() {
		return targetWord;
	}
	
	public int getLives() {
		return player.getLives();
	}

	public void decreaseLives() {
		int lives = player.getLives();
		if(lives > 0) {
			player.setLives(lives-1);
		}
		else {
			gameEnd = true;
		}
	}

	public boolean getGameStatus() {
		return gameEnd;
	}
	
	private void win() {
		player.playerWins();
		end();
	}
	
	public void end() {
		gameEnd = true;
		if(player.getWin()) {
			//player wins
		}
		else {
			//player loses
		}
	}

}

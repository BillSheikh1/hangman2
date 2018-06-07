package UserInput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserInput {
	
	//fields 
	String word;
	String userInput;
	
	public UserInput() 
	{
	}
	
	public Guess validateInput(String userInput)
	{
		Guess guess = null;
		this.userInput = userInput;
		
		if (isAnInt(userInput))
		{
			//Error handle not a number
		}
		else if (isSpecial(userInput))
		{
			//Error handle not a special
		}
		else {
			if(userInput.length() > 1) {
				if(!isMoreThanOneWord(userInput)) {
					guess = new Word(userInput);
				}
				else {
					//Error don't input more than one word
				}
				
			}
			else if(userInput.length() == 1) {
				guess = new Letter(userInput);
			}
			else {
				// Error handle no input
			}
		}
		return guess;
	}
	
	private boolean isMoreThanOneWord(String input) {
		String[] inputArray = input.split(" ");
		if(inputArray.length > 1) {
			return true;
		}
		return false;
	}
	
	private boolean isAnInt(String input) {
		Pattern digit = Pattern.compile("[0-9]");
		Matcher hasDigit = digit.matcher(input);
		return hasDigit.find();
	}
	
	private boolean isSpecial(String input) {
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher hasSpecial = special.matcher(input);
		return hasSpecial.find();
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}	

}

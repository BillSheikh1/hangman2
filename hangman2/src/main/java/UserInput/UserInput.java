package UserInput;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserInput {
	
	//fields 
	String word;
	String userInput;
	ArrayList<String> inputWordList;
	ArrayList<String> inputLetterList;
	//Scanner sc;
	
	public UserInput() 
	{
		//sc = new Scanner(System.in);
		inputWordList = new ArrayList<String>();
		inputLetterList = new ArrayList<String>();
	}
	
	public String input(String userInput)
	{
		String response;
		this.userInput = userInput;
		//userInput = sc.nextLine();
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(userInput);
		
		if (userInput.matches(".*\\d+.*"))
		{
			return response = "please do not input any numbers";
		}
		else if (!matcher.matches())
		{
			return response = "please do not input any special characters";
		}
		else if (userInput.length() > word.length() || (userInput.length() < word.length() && userInput.length() != 1))
		{
			return response = "please input a word that is " + word.length() + " characters in length" ;
		}
		else if (userInput.length() == 1) 
		{
	    	boolean exists = false;
			for (String w : inputLetterList) 
	    	{
	    		if (w.equals(userInput)) 
	    		{
	    			exists = true;
	    		}
	    	}
			if (exists)
			{
				return response = "letter has already been used";
			}
			else
			{
				inputLetterList.add(userInput);
				return response = "input letter sucessful";
			}
		}
		else 
		{
			boolean exists = false;
			for (String w : inputWordList) 
	    	{
	    		if (w.equals(userInput)) 
	    		{
	    			exists = true;
	    		}
	    	}
			
			if (exists)
			{
				return response = "word has already been used";
			}
			else
			{
				inputWordList.add(userInput);
				return response = "input word sucessful";
			}
		}
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public ArrayList<String> getInputWordList() {
		return inputWordList;
	}

	public void setInputWordList(ArrayList<String> inputWordList) {
		this.inputWordList = inputWordList;
	}

	public ArrayList<String> getInputLetterList() {
		return inputLetterList;
	}

	public void setInputLetterList(ArrayList<String> inputLetterList) {
		this.inputLetterList = inputLetterList;
	}	
	
	
	

}

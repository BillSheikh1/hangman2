package hangman2;

import static org.junit.Assert.*;

import org.junit.Test;

import UserInput.UserInput;

public class UserInputTest {

	@Test
	public void test() 
	{
		//numbers and special characters 
		
		UserInput input = new UserInput();
		
		input.setWord("catus");
		
		//input word 
		input.validateInput("aaaaa");
		
		//input letter
		input.validateInput("a");
		
		
		System.out.println(input.validateInput("a"));
		System.out.println(input.validateInput("asdfghjkl"));
		System.out.println(input.validateInput("12345"));
		System.out.println(input.validateInput("!"));
		System.out.println(input.validateInput("asd1g"));
		System.out.println(input.validateInput("asd!g"));
		
		
		String acutal = "a";
		String test = "b";
		
	}

}

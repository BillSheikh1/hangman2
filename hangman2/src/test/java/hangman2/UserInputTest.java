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
		input.input("aaaaa");
		
		//input letter
		input.input("a");
		
		assertNotNull(input.getInputWordList());
		assertNotNull(input.getInputLetterList());
		
		System.out.println(input.input("a"));
		System.out.println(input.input("aaaaa"));
		System.out.println(input.input("bb"));
		System.out.println(input.input("asdfghjkl"));
		System.out.println(input.input("12345"));
		System.out.println(input.input("1"));
		System.out.println(input.input("28"));
		System.out.println(input.input("!"));
		System.out.println(input.input("%!"));
		System.out.println(input.input("asd1g"));
		System.out.println(input.input("asd!g"));
		
		
	}

}

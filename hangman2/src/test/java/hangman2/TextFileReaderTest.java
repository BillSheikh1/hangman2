package hangman2;

import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;
import TextFileReader.TextFileReader;

public class TextFileReaderTest {

	@Test
	public void test() {
		
		TextFileReader tfr = new TextFileReader();
		
		tfr.ProduceWordList("wordsEn.txt");
		
		assertNotNull(tfr.getWordList());
		
		//Take a text file as an input. Read the text file. Store contents in an array list.
		
	}

}

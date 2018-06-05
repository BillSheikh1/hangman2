package TextFileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;

public class TextFileReader {
	
	//fields 
	String word;
	ArrayList<String> wordList;
	
	public TextFileReader() 
	{
		wordList = new ArrayList<String>();
	}
	
	public void ProduceWordList(String fileName)
	{
	
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		File file = new File(resource.getFile());
		try
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNext())
			{
				wordList.add(sc.next());
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	public ArrayList<String> getWordList() 
	{
		return wordList;
	}


	
	
	
	

}

package StringPrograms;

import org.testng.annotations.Test;

public class PrintEvenLengthWords {

	@Test
	public void printEvenLengthWords()
	{
		String given = "This is a java language pet";
		String[] words = given.split(" ");
		
		for(String word: words)
		{
			if(word.length()%2==0)
			{
				System.out.print(word);
				System.out.print(" ");
			}
		}
	}
}

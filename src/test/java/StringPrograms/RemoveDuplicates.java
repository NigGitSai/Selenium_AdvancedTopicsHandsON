package StringPrograms;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicates {
	
	@Test
	public void removeDuplicatesInString()
	{
		String givenWord = "Tomorrow";
		String finalWord = givenWord;
		System.out.println("Before removing given word :"+givenWord);
		Set<Character> set = new HashSet<Character>();
		char ch;
		for(int i=0;i<givenWord.length();i++)
		{
			ch = givenWord.charAt(i);
			if(set.add(ch)==false)
			{
				finalWord = finalWord.replaceAll(String.valueOf(ch), "");
			}
		}
		
		System.out.println("After removing duplicate words :"+finalWord);
	}

}

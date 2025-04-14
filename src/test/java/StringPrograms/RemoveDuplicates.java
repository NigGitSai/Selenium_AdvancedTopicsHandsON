package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicates {
	
	@Test
	public void removeDuplicatesInString()
	{
		String givenWord = "Tomorrow";
		String finalWord = "";
		System.out.println("Before removing given word :"+givenWord);
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		char ch;
		for(int i=0;i<givenWord.length();i++)
		{
			ch = givenWord.charAt(i);
			set.add(ch);
		}
		for(Character c:set)
		{
			finalWord =finalWord+c;
		}
		
		System.out.println("After removing duplicate words :"+finalWord);
	}

}

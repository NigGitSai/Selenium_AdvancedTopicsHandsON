package StringPrograms;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class CountNoOfVowelsNConsonants {
	
	@Test
	public void countNoOfVowelsNConsonants()
	{
		
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		
		String text = "WELCOME";
		
		text = text.toLowerCase();
		int count =0;
		for(int i=0;i<text.length();i++)
		{
			if(vowels.contains(text.charAt(i)))
			{
				count = count +1;
			}
		}
		System.out.println("Vowels count :"+count);
		int consonantsCount = (text.length()-1)- count;
		System.out.println("Consonants count :"+consonantsCount);
	}

}

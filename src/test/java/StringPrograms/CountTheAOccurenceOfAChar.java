package StringPrograms;

import org.testng.annotations.Test;

public class CountTheAOccurenceOfAChar {
	
	
	@Test(enabled = false)
	public void countTheOccurence()
	{
		String text = "I have a blue umbrella";
		text = text.toLowerCase();
		char charToFind = 'a';
		
		int count =0;
		int pos = 0;
		for(int i =0; i< text.length();i++)
		{
			pos = i+1;
			if(text.charAt(i)==charToFind)
			{
				count = count +1;
				System.out.println(charToFind+" is  found at "+pos+" position in text");
			}
		}
		System.out.println("count of occurences of char a is "+count);
	}

	
	@Test
	public void countTheOccurenceWOIteration()
	{
		String text = "I have a blue umbrella";
		text = text.toLowerCase();
		int orgLength = text.length();
		
		
		text = text.replaceAll("a", "");
		int afterRemovingChar = text.length();
		
		int occurence = orgLength - afterRemovingChar;
		System.out.println("count of occurences of char a is "+occurence);
	}
}

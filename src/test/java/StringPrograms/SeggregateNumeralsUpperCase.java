package StringPrograms;

import org.testng.annotations.Test;

public class SeggregateNumeralsUpperCase {

	@Test
	public void seggregateNumerals()
	{
		String text = "Welcome24";
		
		String numerals= "",uppercase ="",lowercase="";
		
		char[] charArr = text.toCharArray();
		
		for(int i=0; i<charArr.length;i++)
		{
			if(Character.isAlphabetic(charArr[i]))
			{
				if(Character.isUpperCase(charArr[i]))
					
					
				{
					
					uppercase=uppercase+charArr[i];
				}
				else
				{
					lowercase = lowercase+charArr[i];
				}
			}
			else if(Character.isDigit(charArr[i]))
			{
				numerals = numerals+charArr[i];
			}
		}
		
		System.out.println("Digits in the given string : "+numerals);
		System.out.println("Uppercase in the given string : "+uppercase);
		System.out.println("Lowercase in the given string : "+lowercase);
	}
}

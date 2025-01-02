package StringPrograms;

import org.testng.annotations.Test;

public class ReverseOnlyAlphabets {
	
	@Test
	public void reverseOnlyAlphabets()
	{
		String text = "31Big&8Banana";
		
		char[] chArr = text.toCharArray();
		StringBuilder alphabets = new StringBuilder();
		
		for(int i=0; i<chArr.length;i++)
		{
			if(Character.isAlphabetic(chArr[i]))
			{
				alphabets.append(chArr[i]);
			}
			else
			{
				reverseAlphabets(alphabets);
				System.out.print(chArr[i]);
			}
			
		}
		reverseAlphabets(alphabets);
		
		
		
	}
	
	public void reverseAlphabets(StringBuilder str)
	{
		System.out.print(str.reverse());
		str.setLength(0);
	}

}

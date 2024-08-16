package StringPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class TestStringAnagram {
	
	@Test
	public void testAnagram()
	{
		
		
		//earth and thing are Anagram , if we jumble the characters of a String we should get the second word
		//eg: act and cat
		
		String fistWord = "earth";
		String secondWord = "thing";
		char[] firstWordChar = fistWord.toLowerCase().toCharArray();
		char[] secondWordChar = secondWord.toLowerCase().toCharArray();
		boolean flag = false;
		if(fistWord.length()!=secondWord.length())
		{
			flag = false;
		}
		Arrays.sort(firstWordChar);
		Arrays.sort(secondWordChar);
		int count =0;
		for(int i=0;i<fistWord.length();i++)
		{
			if(firstWordChar[i]==secondWordChar[i])
			{
				flag = true;
				count = count+1;
			}
			else
			{
				flag = false;
				break;
			}
				
		}
		
		if(flag == true && count==fistWord.length())
		{
			System.out.println("The strings are Anagram to each other");
		}
		else
		{
			System.out.println("The strings are not Anagram");
		}
	}
	
	


}

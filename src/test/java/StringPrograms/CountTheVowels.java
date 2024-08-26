package StringPrograms;

import org.testng.annotations.Test;

public class CountTheVowels {
	
	@Test
	public void countTheVowels()
	{
		String name = "butter";
		name = name.toLowerCase();
		char ch;
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			ch = name.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
			{
				count = count +1;
			}
		}
		System.out.println("Count of vowels :"+count);
	}

}

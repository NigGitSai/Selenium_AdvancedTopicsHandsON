package StringPrograms;

import org.testng.annotations.Test;

public class ReplaceVomwelsWithStar {
	
	
	@Test(enabled = false)
	public void usingCharArrayIteration()
	{
		String given = "I had vannila IceCream";
		given = given.toLowerCase();
		
		
		for(int i=0; i<given.length(); i++)
		{
			if(given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' || given.charAt(i)=='o' || given.charAt(i)=='u')
			{
				given = given.replace(given.charAt(i), '*');
			}
		}
		System.out.println("Final string :"+given);
	}

	
	@Test
	public void usingRegex()
	{
		String given = "I had vannila IceCream";
		
		
		given = given.replaceAll("[aeiouAEIOU]", "\\$");
		
		System.out.println("Final string :"+given);
		System.out.println("\"Happy birthday\"");
	}
}

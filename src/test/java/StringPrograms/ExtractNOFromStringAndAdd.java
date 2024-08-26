package StringPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ExtractNOFromStringAndAdd {

	@Test(enabled = false)
	public  void usingCharacterIsDigitMethod() {
		// TODO Auto-generated method stub
		
		String given = "12MondayTest10";
		
		int total =0;
		char ch;
		List<Integer> numbersLst = new ArrayList<Integer>();
		for(int i=0;i<given.length();i++)
		{
			ch = given.charAt(i);
			if(Character.isDigit(ch))
			{
				total = total + Character.getNumericValue(ch);
			}
		}
		System.out.println("The total is  "+total);

	}
	
	@Test(enabled = true)
	
	public static void extractNOFromString()
	{
	String given = "12MondayTest10";
		
		int total =0;
		char ch;
		for(int i=0;i<given.length();i++)
		{
			ch = given.charAt(i);
			Pattern pattern = Pattern.compile("\\d+");
				Matcher matcher = pattern.matcher(given);
				while(matcher.find())
				{
					System.out.println(matcher.group());
					total = total+Integer.parseInt(matcher.group());
				}
	}
		System.out.println("total is "+total);
	}
	

}

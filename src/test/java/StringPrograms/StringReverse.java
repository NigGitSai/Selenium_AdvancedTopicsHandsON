package StringPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringReverse {

	
	@Test
	public void stringReverseWOUsingInbuiltFunc()
	{
		String text = "WELCOME";
		String reverse="";
		for(int i=text.length()-1;i>=0;i--)
		{
			reverse = reverse+text.charAt(i);
		}
		System.out.println("Given String "+text);
		System.out.println("Reversed String : "+reverse);
		
	}
	
	@Test
	public void stringReverseUsingInbuiltFunc()
	{
		String text = "WELCOME";
		StringBuffer bf = new StringBuffer(text);
		String reverse = String.valueOf(bf.reverse());
		System.out.println("Given String "+text);
		System.out.println("Reversed String : "+reverse);
		
	}
}

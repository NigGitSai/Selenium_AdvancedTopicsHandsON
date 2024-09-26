package StringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringReverse {

	
	@Test(enabled=true)
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
	
	@Test(enabled=true)
	public void stringReverseUsingInbuiltFunc()
	{
		String text = "WELCOME";
		StringBuffer bf = new StringBuffer(text);
		
		String reverse = String.valueOf(bf.reverse());
		System.out.println("Given String "+text);
		System.out.println("Reversed String : "+reverse);
		
	}
	
	@Test(enabled=true)
	public void usingCollections()
	{
		String text = "WELCOME";
		char[] characters = text.toCharArray();
		List<Character> lst = new ArrayList<Character>();
		
		for(char letter:characters)
		{
			lst.add(letter);
		}
		Collections.reverse(lst);
		
		ListIterator<Character> iterator = lst.listIterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
	}
	
}

package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DuplicatesINArray {

	@Test(description = "using HashSet" , enabled = false )
	public void findDuplicatesInStringArray()
	{
		String sentence = "Hey Java is the best language Java is object orient programming language";
		String[] s = sentence.split(" ");
		
		HashSet<String> hashsetS1 = new HashSet<String>();
		ArrayList<String> duplicates = new ArrayList<String>();
		
		for(String arr:s)
		{
			if(hashsetS1.add(arr)==false)
			{
				duplicates.add(arr);
			}
			
		}
		System.out.println("The duplicate words are :");
		for(String arr:duplicates)
		{
			System.out.print(arr+" ");
		}
	}
	
	@Test(description = "using HashMap")
	public void findDuplicatesInStringArray2()
	{
		String sentence = "Hey Java is the best language Java is object orient programming language";
		String[] s = sentence.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		Integer count;
		for(String arr: s)
		{
			count = hm.get(arr);
			if(count==null)
			{
				hm.put(arr, 1);
			}
			else
			{
				hm.put(arr, ++count);
			}
		}
		System.out.println("The duplicate words are :");
		for(Entry<String,Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}

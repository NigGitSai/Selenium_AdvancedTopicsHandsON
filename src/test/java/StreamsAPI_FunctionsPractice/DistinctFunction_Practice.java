package StreamsAPI_FunctionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class DistinctFunction_Practice {
	
	@Test
	public void removeDuplicateIntegers()
	{
		List<Integer> intList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		System.out.println("Given integer list "+intList);
		
		List<Integer> afterRemovingDup =    intList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After removing duplicates "+afterRemovingDup);
	}
	
	@Test
	public void returnUniqueCharInString()
	{
		String given = "banana";
		
		 char[] charArr = given.toCharArray();
		  List<Character> uniqueChar = given.chars().mapToObj(c->(char)c).
		 distinct().collect(Collectors.toList());
		  System.out.println(" Unique letters inn given word "+given +" is "+uniqueChar);
		  
	}
	
	@Test
	public void removeDuplicateWords()
	{
		String givenSentence  = "this is is a test test";
		String[] words = givenSentence.split(" ");
		
		
		
		
		List<String>  lstWords =	Arrays.stream(words).distinct().collect(Collectors.toList());
	      System.out.println(" unique words : "+lstWords);
	}

}

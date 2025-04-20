package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class DistinctFunction_Practice {
	
	@Test
	public void findUniqueEvenNumbers()
	{
		List<Integer> intList = Arrays.asList(1, 2, 2, 4, 4, 6, 7);
		
	    List<Integer> uniqueEvenNumbers =	intList.stream().filter(num->num%2 ==0).distinct().collect(Collectors.toList());
		
	    System.out.println("Unique even numbers "+uniqueEvenNumbers);
	}
	
	@Test
	public void retrieveUniqueFirstChar()
	{
		List<String> words = Arrays.asList("Alice", "Andrew", "Bob", "Charlie", "Amanda");
	  List<Character> firstChar =	words.stream().map(word -> word.charAt(0)).distinct().collect(Collectors.toList());
	System.out.println("Unique first char :"+firstChar);
	
	}
	
	@Test
	public void retrieveDistinctWords()
	{
		List<String> sentences = Arrays.asList("hello world", "hello java", "world of java");

		List<String> uniqueWords = sentences.stream().flatMap(c->Arrays.stream(c.split(" "))).distinct().sorted().collect(Collectors.toList());
		System.out.println("unique words : "+uniqueWords);
	}

}

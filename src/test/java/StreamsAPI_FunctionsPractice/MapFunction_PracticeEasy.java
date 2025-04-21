package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class MapFunction_PracticeEasy {
	
	@Test
	public void convertAllWordsToUpperCase()
	{
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		// Convert to uppercase: ["ALICE", "BOB", "CHARLIE"]
	   List<String> upNames =	names.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	   System.out.println("Upper case names : "+upNames);
		
	}
	
	@Test
	public void findLengthOfEachString()
	{
		List<String> fruits = Arrays.asList("apple", "banana", "cherry");
		// Output: [5, 6, 6]
		List<Integer> fruitsLength =   fruits.stream().map(e->e.length()).collect(Collectors.toList());
		System.out.println("fruits length");
		System.out.println(fruitsLength);
	}
	
	@Test
	public void squareEachNo()
	{
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		// Output: [4, 9, 16, 25]
		
		  numbers = numbers.stream().map(n->n*n).collect(Collectors.toList());
		  System.out.println("Square of each number : "+numbers);
		  
	}
	

}

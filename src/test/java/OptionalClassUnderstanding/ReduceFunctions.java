package OptionalClassUnderstanding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ReduceFunctions {
	
	@Test
	public void addListOfNumbers()
	{
		List<Integer> numbers = Arrays.asList(11,2,3,4,5,6);
		int sumResult = numbers.stream().reduce(0,(sum,element)->sum+element);
		System.out.println("Addition value "+sumResult);
		
		List<Integer> add2List =    numbers.stream().map(ele->ele+2).collect(Collectors.toList());
		System.out.println("Adding 2 to all numbers in the list");
		System.out.println(""+add2List);
	}
	
	@Test
	public void mulListOfNumbers()
	{
		List<Integer> numbers = Arrays.asList(11,2,3,4,5,6);
		int mulResult = numbers.stream().reduce(1,(result,element)->result*element);
		System.out.println("Multiplication value "+mulResult);
		
		
	}

	
}

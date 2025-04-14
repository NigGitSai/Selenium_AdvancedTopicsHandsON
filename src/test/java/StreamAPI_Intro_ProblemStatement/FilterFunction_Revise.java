package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class FilterFunction_Revise {
	
	@Test
	public void filterWordsMoreThan5Char()
	{
		List<String> fruits = Arrays.asList("Apple","Mango","Pineapple","Apple","Pineapple","Jackfruit");
		
	   fruits =	fruits.stream().filter(fruit->fruit.length()>5).collect(Collectors.toList());
	   System.out.println("Words more than 5 charachters");
	   System.out.println(fruits);
	}
	
	@Test
	public void filterPrimeNumbers()
	{
		List<Integer> intList =	  Arrays.asList(12,5,12,11,11,89,2,11,6,5,9,10);
		
	   List<Integer> primeNumbers =	intList.stream().filter(FilterFunction_Revise::isPrime).collect(Collectors.toList());
	   
	   System.out.println("Prime numbers in the list "+primeNumbers);
	}

	private static boolean isPrime(int number)
	{
		if(number <=1)
			return false;
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(n->number%n!=0);
	}
}

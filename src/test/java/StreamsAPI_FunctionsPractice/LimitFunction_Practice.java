package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class LimitFunction_Practice {

	@Test
	public void printFirst3EvenNo()
	{
		List<Integer> numbers = Arrays.asList(1,2, 4,5, 6, 8, 10, 12, 14);
		List<Integer> first3EvenNumbers =  numbers.stream().filter(n->n%2==0).limit(3).collect(Collectors.toList());
		System.out.println("First 3 even numbers :"+first3EvenNumbers);
		
	}
	
	@Test
	public void printFirstFiveName()
	{
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Frank");

		names.stream().limit(5).forEach(System.out::println);
	}
	
	@Test
	public void printTop3LongWords()
	{
		List<String> words = Arrays.asList("stream", "lambda", "java", "functional", "interface", "method", "reference");

		List<String> top3Words = words.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(3).collect(Collectors.toList());
		System.out.println("Top 3 long words :"+top3Words);
	}
	
	@Test
	public void printFirst5PrimeNumbers()
	{
		IntStream.iterate(11, i->i+1).filter(LimitFunction_Practice::isPrime).limit(5).forEach(System.out::println);
	}
	public static boolean isPrime(int num)
	
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

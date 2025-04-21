package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AnyMatch_PracticeEasy {

	@Test
	public void anyEvenNO()
	{
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
		// Use anyMatch to check if any number is even
		boolean anyEvenNO = numbers.stream().anyMatch(n->n%2==0);
		System.out.println("Any even number in the list "+anyEvenNO);
	}
	
	@Test
	public void checkForEmptyStrings()
	{
		List<String> names = Arrays.asList("John", "", "Alice", "Bob");
		// Use anyMatch to check if any string is empty

		boolean blFlag = names.stream().anyMatch(name->name.equals(""));
		System.out.println("Does the list has any empty string :"+blFlag);
	}
	
	@Test
	public void checkIfAnyNameStartsWithA()
	{
		List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Steve");
		// Use anyMatch to check for names starting with 'A'
		boolean blFlag = names.stream().anyMatch(name->name.charAt(0)=='A');
		System.out.println("Does the list contain any name starting with A : "+blFlag);
	}
}

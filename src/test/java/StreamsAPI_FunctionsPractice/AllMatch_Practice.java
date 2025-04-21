package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AllMatch_Practice {
	
	@Test
	public void verifyAllWordsAreLowerCase()
	{
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		// Use allMatch to verify if all strings are in lowercase
		
	    boolean allAreInLowerCase =	words.stream().allMatch(w->w.replaceAll("[A-Z]", "").equals(w));
	    System.out.println("Is all words in lowercase : "+allAreInLowerCase);
	}
	
	@Test
	public void checkIfAllNumsArePositve()
	{
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		// Use allMatch to check if all numbers > 0

		boolean blFlag = numbers.stream().allMatch(n->n>0);
		System.out.println("is all numbers in the list are positive :"+blFlag);
	}
	
	@Test
	public void checkIfAllWordsStartWithA()
	{
		List<String> names = Arrays.asList("Alice", "Andrew", "Angela");
		// Use allMatch to ensure every name starts with 'A'

		boolean blFlag = names.stream().allMatch(n->n.charAt(0)=='A');
		System.out.println("All words start with A : "+blFlag);
	}

}

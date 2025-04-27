package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.testng.annotations.Test;

public class SortedFunction_PracticeList {

	@Test
	public void sortIntListInAscending()
	{
		 List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		 System.out.println("After sorting in ascending order");
		 
		  numbers.stream().sorted().forEach(System.out::println);
	}
	

	@Test
	public void sortIntListInDescending()
	{
		 List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		 System.out.println("After sorting in descending order");
		 
		  numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	@Test
	public void sortIntListInDescending2()
	{
		 List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
		 System.out.println("After sorting in descending order");
		 
		  numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	@Test
	public void sortStringListInAscending()
	{
		 List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
		 
		 System.out.println("After sorting the names in ascending order");
		 names.stream().sorted().forEach(System.out::println);
	}
	
	@Test
	public void sortStringListInDescendingOrder()
	{
		List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
	
		System.out.println("After sorting the names in descending order");
		names.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}

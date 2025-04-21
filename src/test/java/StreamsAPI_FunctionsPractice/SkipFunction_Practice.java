package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class SkipFunction_Practice {

	@Test
	public void skipFirstThreeNOs()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().skip(3).forEach(System.out::println);
	}
	
	@Test
	public void skipFirstWord()
	{
		List<String> words = Arrays.asList("Java", "is", "fun", "and", "powerful");
		List<String> words1 =	words.stream().skip(1).collect(Collectors.toList());
		System.out.println("After skipping first word : "+words1);
	}
	
	@Test
	public void skipTop3Students()
	{
		List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		students.stream().skip(2).forEach(n->System.out.print(n+" "));
	}
}

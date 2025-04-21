package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class MapFunction_PracticeMedium {

	@Test
	public void covertListOfStringToMap()
	{
		List<String> animals = Arrays.asList("cat", "elephant", "tiger");
		// Output: {"cat"=3, "elephant"=8, "tiger"=5}
		
	    Map<String,Integer> animalMap =	animals.stream().collect(Collectors.toMap(a->a, a->a.length(),(key1,key2)->key1));

	    System.out.println("Animal Map : "+animalMap);
	}
	
	@Test
	public void covertListOfStringToMap2()
	{
		List<String> animals = Arrays.asList("cat", "elephant", "tiger");
		// Output: {"cat"=3, "elephant"=8, "tiger"=5}
		
	    Map<String,Integer> animalMap =	animals.stream().collect(Collectors.toMap(a->a, String::length,(key1,key2)->key1));

	    System.out.println("Animal Map : "+animalMap);
	}
	
	@Test
	public void covertToEvenOddInt()
	{
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		// Output: ["Odd", "Even", "Odd", "Even"]
		 List<String> oddOrEven =  nums.stream().map(n->returnOddEven(n)).collect(Collectors.toList());
		 System.out.println("Odd or Even :"+oddOrEven);
	}
	
	@Test
	public void getFirstLetterOfEachName()
	{
		List<String> fullNames = Arrays.asList("John Doe", "Jane Smith", "Alice Ray");
		// Output: ["J", "J", "A"]
		List<Character> firstLetter = fullNames.stream().map(name->name.charAt(0)).collect(Collectors.toList());
		System.out.println("First Letter list : "+firstLetter);
	}
	
	
	public static String returnOddEven(int num)
	{
		
		if(num%2==0)
		{
			return "Even";
		}
		else
		{
		return "Odd";
		}
	}
	
}

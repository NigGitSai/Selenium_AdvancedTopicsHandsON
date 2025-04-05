package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AllMatch_Understanding {
	
	
	@Test
	public void findListIsOdd()
	{
		List<Integer> numbers = Arrays.asList(11,13,89,99,45,33);
		
		boolean allOdd = numbers.stream().allMatch(num->num/2!=0);
		System.out.println("The numbers  in the list  "+allOdd);
	}
	
	@Test
	public void firstLetterCapitalCheck()
	{
		List<String> fruits = Arrays.asList("Banana","Orange","Apple","Grapes","Kiwi");
		
		boolean flag = fruits.stream().allMatch(fruit->(int) fruit.charAt(0)>= 65 || (int) fruit.charAt(0)<=90);
		System.out.println("The fruits starting letter is in upper case  "+flag);
	}
	
	@Test
	public void allEleDivisibleBy3()
	{
		List<Integer> numbers = Arrays.asList(12,6,18);
		
		boolean flag = numbers.stream().allMatch(num->num%3==0);
		System.out.println("Is all elements divisible by 3 "+flag);
	}
	
	

	@Test
	public void allAreEmpty()
	{
		List<String> noValueList = Arrays.asList("","","","","");
		
		boolean flag = noValueList.stream().allMatch(str -> str.isEmpty());
		System.out.println("All elements empty  "+flag);
	}
	

	@Test
	public void allFilesHaveTxtExtension()
	{
		List<String> files = Arrays.asList("a.txt","b.txt","xx.txt","y.txt");
		
		boolean flag = files.stream().allMatch(fileName -> fileName.contains(".txt"));
		System.out.println("All the files are text files  "+flag);
	}
}

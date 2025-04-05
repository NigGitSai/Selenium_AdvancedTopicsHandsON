package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AnyMatch_Understanding {

	@Test
	public void findMatchString()
	{
		List<String> activity = Arrays.asList("Run","sit","sit","Run");
		
		boolean flag = activity.stream().anyMatch(string->string.equals("Run"));
		
		System.out.println("Activity run is "+flag);
		
	}
	
	@Test
	public void findMatchInteger()
	{
		List<Integer> numbers = Arrays.asList(12,13,89,9045,32);
		
		boolean flag = numbers.stream().anyMatch(num->num==13);
		
		System.out.println("Does the list has number 13 "+flag);
		
	}
}

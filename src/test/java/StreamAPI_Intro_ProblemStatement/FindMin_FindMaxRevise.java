package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class FindMin_FindMaxRevise {
	
	@Test
	public void findMinUsingMethodReference()
	{
		List<Integer> intList =	  Arrays.asList(12,5,12,11,11,89,11,6,5,9,10);
		
		Optional<Integer> minvalue =intList.stream().reduce(Integer::min);
		
		System.out.println("Minimum value using Method reference  "+minvalue.get());
	}
	
	@Test
	public void findMinUsingLambdaExp()
	{
		List<Integer> intList =	  Arrays.asList(12,5,12,11,11,89,11,6,5,9,10);
		
		Optional<Integer> minValue =    intList.stream().reduce((num1,num2)->Math.min(num1, num2));
		System.out.println("Minimum value using lambda expression "+minValue.get());

	}
	
	@Test
	public void findMaxusingMethodReference()
	{
		List<Integer> intList =	  Arrays.asList(12,5,12,11,11,90,11,6,5,9,10);
		
		  Optional<Integer> maxvalue =  intList.stream().reduce(Integer::max);
		  System.out.println("Maximum value using Method reference "+maxvalue.get());
	}
	
	@Test
	public void maxValueUsingLambdaExp()
	{
		List<Integer> intList =	  Arrays.asList(12,5,12,11,11,90,11,6,5,9,10);
		Optional<Integer>  maxValue =  intList.stream().reduce((num1,num2)->Math.max(num1,num2));
		System.out.println("Maximum value using Lambda expression "+maxValue);
	}

}

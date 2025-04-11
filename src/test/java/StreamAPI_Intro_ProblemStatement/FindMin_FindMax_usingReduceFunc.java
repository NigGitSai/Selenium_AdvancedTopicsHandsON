package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class FindMin_FindMax_usingReduceFunc {
	
	
	@Test
	public void findingMinimumValue()
	{
		  List<Integer> numbers = Arrays.asList(12,54,1,2,9,6,51);
		  
		    Optional<Integer> minValue =  numbers.stream().reduce((num1,num2)->Math.min(num1, num2));
		    System.out.println("Minimum value is "+minValue.get());
	}

	@Test
	public void findingMinimumValueusingMethodRef()
	{
		  List<Integer> numbers = Arrays.asList(12,54,1,2,9,6,51);
		  
		    Optional<Integer> minValue =  numbers.stream().reduce(Integer::min);
		    System.out.println("using method reference minimum value is "+minValue.get());
	}
	
	@Test
	public void findingMaxValue()
	{
		List<Integer> numbers = Arrays.asList(12,54,1,2,9,6,51);
		
		  Optional<Integer> maxValue =   numbers.stream().reduce((num1,num2)->Math.max(num1, num2));
		  System.out.println("Maximum value :"+maxValue.get());
	}
	
	@Test
	public void findingMaxValueUsingMethodReference()
	{
		List<Integer> numbers = Arrays.asList(12,54,1,2,9,6,51);
		
		  Optional<Integer> maxValue =   numbers.stream().reduce(Integer::max);
		  System.out.println("Maximum value using method reference :"+maxValue.get());
	}
	
	

}

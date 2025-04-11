package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ReduceFunction_Understanding {
	
	@Test
	public void additionEx()
	{
	   List<Integer> numbers =	Arrays.asList(1,2,4,5,6,29);
	   
	  int sumResult =   numbers.stream().reduce(0,(sum,element)->sum+element);
	  System.out.println("Addition result "+sumResult);
	}
	
	@Test
	public void multiplicationEx()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		int mulResult = numbers.stream().reduce(1,(result,ele)-> result*ele);
		System.out.println("Multiplication result "+mulResult);
	}

}



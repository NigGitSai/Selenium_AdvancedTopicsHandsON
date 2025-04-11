package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class CountFunction_Understanding {
	
	@Test
	public void countEx()
	{
		 List<Integer> numbers =    Arrays.asList(1,2,3,4,5,6);
		 
	 long noOfElements = 	 numbers.stream().count();
	 
	 System.out.println("No of elements "+noOfElements);
	}

}

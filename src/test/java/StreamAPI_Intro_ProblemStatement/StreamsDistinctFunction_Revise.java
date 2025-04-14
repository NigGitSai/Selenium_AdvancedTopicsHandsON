package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamsDistinctFunction_Revise {
	
	@Test
	public void intList()
	{
	    List<Integer> intList =	  Arrays.asList(12,5,12,11,11,89,11,6,5,9,10);
	    System.out.println("Given List "+intList);
	    
	    intList =    intList.stream().distinct().collect(Collectors.toList());
	    
	    System.out.println("After removing  duplicates "+intList);
		  
	}

}

package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class UnmodifiableSet {
	
	
	@Test
	public void unmodifiableListEx()
	{
		List<String> colors =   Arrays.asList("Pink","Violet","White","Yellow","Green","Pink");
		 
		  Set<String> uniqueColors =  colors.stream().collect(Collectors.toUnmodifiableSet());
		  System.out.println(" unique colors "+uniqueColors);
		  uniqueColors.add("Orange");
		  
	}

}

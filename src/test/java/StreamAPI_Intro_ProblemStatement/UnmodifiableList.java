package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class UnmodifiableList {

	@Test
	public void unmodifiableListEx()
	{
		List<String> colors =   Arrays.asList("Pink","Violet","White","Yellow","Green");
		 
		  List<Integer> length =  colors.stream().map(String::length).collect(Collectors.toUnmodifiableList());
		  System.out.println(" Result length list "+length);
		  length.add(3);
		  
	}
}

package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class FindAny_Understanding {
	
	@Test
	public void usingSeqStream()
	{
		List<String> letter = Arrays.asList("A","B","C");
		
		Optional<String> ele = letter.stream().findAny();
		

		System.out.println("Direct print "+ele);
		
		System.out.println("using get object "+ele.get());
	}
	
	@Test
	public void usingParallelStream()
	{
		List<String> letter = Arrays.asList("A","B","C");
		
		Optional<String> ele = letter.parallelStream().findAny();
		
		System.out.println("using Parallel Stream");
		System.out.println("Direct print "+ele);
		
		System.out.println("using get object "+ele.get());
	}

}

package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;

public class FindFirst_Understanding {

	@Test
	public void usingSeqStream()
	{
		List<String> letter = Arrays.asList("A","B","C");
		
		Optional<String> firstEle = letter.stream().findFirst();
		
		System.out.println("Direct print "+firstEle);
		
		System.out.println("using get object "+firstEle.get());
	}
	
	@Test
	public void usingParallelStream()
	{
		List<String> letter = Arrays.asList("A","B","C");
		
		Optional<String> firstEle = letter.parallelStream().findFirst();
		
		System.out.println("using Parallel Stream");
		System.out.println("Direct print "+firstEle);
		
		System.out.println("using get object "+firstEle.get());
	}
}

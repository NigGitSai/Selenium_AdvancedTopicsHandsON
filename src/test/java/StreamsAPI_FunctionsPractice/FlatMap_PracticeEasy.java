package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FlatMap_PracticeEasy {

	@Test
	public void flattenListListOfString()
	{
		List<List<String>> nestedList = Arrays.asList(
			    Arrays.asList("a", "b"),
			    Arrays.asList("c", "d"),
			    Arrays.asList("e")
			);
		
		List<String> letterList =   nestedList.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		
		System.out.println("After flatting the list of list of String "+letterList);
	}
	
	@Test
	public void convertListOfSentencesToWords()
	{
		List<String> sentences = Arrays.asList(
			    "Java is fun",
			    "FlatMap is powerful"
			);

		 List<String> words =   sentences.stream().flatMap(e->Arrays.stream(e.split(" "))).collect(Collectors.toList());
		 System.out.println(words);
	}
}

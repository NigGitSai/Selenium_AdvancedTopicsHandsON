package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FilterFunction_PracticeEasy {

	@Test
	public void filterEvenNo()
	{
		List<Integer> intList =   Arrays.asList(1, 2, 3, 4, 5, 6);
	    List<Integer> evenNOS =	 intList.stream().filter(e->e%2==0).collect(Collectors.toList());
	    System.out.println("Even numbers "+evenNOS);
	}
	
	@Test
	public void filterStringsStartingWithA()
	{
		List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
		List<String> wordsStartingWithA =  words.stream().filter(e->e.charAt(0)=='A').collect(Collectors.toList());
		System.out.println("Words staring with A : "+wordsStartingWithA);
	}
	
	@Test
	public void filterPositiveNOs()
	{
	  List<Integer> intList = 	Arrays.asList(-3, -1, 0, 2, 4);
	  
	  List<Integer> posNum =  intList.stream().filter(m->m>0).collect(Collectors.toList());
	  System.out.println("positive numbers : "+posNum);
	}
	
}

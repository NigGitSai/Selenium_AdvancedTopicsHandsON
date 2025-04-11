package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;



public class CollectorsFunction_Understanding {

	@Test
	public void findCountOfCharUsingToList()
	{
		 List<String> colors =   Arrays.asList("Pink","Violet","White","Yellow","Green");
		 
		  List<Integer> length =  colors.stream().map(String::length).collect(Collectors.toList());
		
		System.out.println("Colors name length : "+length);
	}
	
	
	@Test
	public void removeDuplicateUsingToSet()
	{
		 List<String> colors =   Arrays.asList("Pink","Violet","White","Yellow","Green","Pink","Violet");
		 
		Set<String> uniqueElements =  colors.stream().collect(Collectors.toSet());
		
		System.out.println("After removing duplicates :"+uniqueElements);
	}
	
	@Test
	public void toCollectionExample()
	{
		 List<String> colors =   Arrays.asList("Pink","Violet","White","Yellow","Green");
		 
	    List<String> resultColors =	 colors.stream().filter(color->color.length()>5).collect(Collectors.toCollection(LinkedList::new));
	
	    System.out.println("The resultant colors "+resultColors);
	}
}

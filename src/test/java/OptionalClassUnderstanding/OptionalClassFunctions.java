package OptionalClassUnderstanding;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.testng.annotations.Test;



public class OptionalClassFunctions {

	@Test
	public void testIsPresent()
	{
		String given = "Star";
		boolean isPresent = Optional.of(given).isPresent();
		
		System.out.println("Is present example "+isPresent);
	}
	
	@Test(enabled =true)
	public void testIsEmpty()
	{
		List<String> lst = new 	ArrayList<String>();
		Optional<List<String>> optionalList =       Optional.of(lst);
		
      System.out.println("lst is empty "+lst.isEmpty());
		System.out.println("Test list is empty "+optionalList.isEmpty());
	}
	
	@Test
	public void testIfPresent()
	{
		List<String> lst = new 	ArrayList<String>();
		lst.add("balloon");
		lst.add("Inkfiller");
		Optional.of(lst).ifPresent(l1->System.out.println("If present example : "+l1.get(1))); 
		
	}
	
	@Test
	public void testOrElseWhenNull()
	{
		String name = null;
		
		String nameIs = Optional.ofNullable(name).orElse("John");
		System.out.println("Or Else example when null "+nameIs);
	}
	
	@Test
	public void testOrElseWhenNotNull()
	{
		String name = "Michael Newton";
		
		String nameIs = Optional.ofNullable(name).orElse("John");
		System.out.println("Or Else example when not null "+nameIs);
	}
	
	
}

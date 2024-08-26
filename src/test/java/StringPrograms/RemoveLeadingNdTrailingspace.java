package StringPrograms;

import org.testng.annotations.Test;

public class RemoveLeadingNdTrailingspace {
	
	@Test(enabled=false)
	public void usingTrim()
	{
		String s= " happy birthday! ";
		System.out.println(s.trim());
	}

	@Test(enabled=false)
	public void usingStrip()
	{
		String s= " happy birthday! ";
		System.out.println("using strip method "+s.strip());
		
		System.out.println("Using strip leading :"+s.stripLeading());
		System.out.println("Using strip trailing :"+s.stripTrailing());
	}
	
	@Test(enabled=true)
	public void usingStripRegex()
	{
		String s= " happy birthday! ";
		System.out.println(s.replaceAll("^[\t]+|[\t]+$", ""));
		
		System.out.println("Remove leading space using regex :"+s.replaceAll("^[\t]", ""));
		System.out.println("Remove trailing space using regec :"+s.replaceAll("[\t]+$", ""));
		String testNum ="happy123";
		System.out.println(testNum.replaceAll("[0-9]", ""));
		System.out.println(testNum.replaceAll("[^0-9]", ""));
	}
	
	

}

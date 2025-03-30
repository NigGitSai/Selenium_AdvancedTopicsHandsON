package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapUnderstanding {
	
	static List<Packages> packages =null;
	
	public static void display(List<Packages> packages)
	{
	System.out.printf("|%-20s|%-20s%n","Name","Items");

	
		for(Packages pack:packages)
		{
		System.out.printf("|%-20s|%-20s|%n",pack.getName(),pack.getItems());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Packages package1 = new Packages("Stationery", Arrays.asList("Erasers","Fevicol"));
		
		Packages package2 = new Packages("Stationery", Arrays.asList("InkFiller","ColorPencils"));
		
		packages = Arrays.asList(package1, package2);
		
		display(packages);
		System.out.println("Without using flat Map");
		woUsingFlatMap();
		
		System.out.println("Using flat Map");
		usingFlatMap();
		
	
	}
	
	public static void usingFlatMap()
	{
		List<String> itemsList =  packages.stream()
		.map(pack->pack.getItems())
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
		
		System.out.println(itemsList);
	}

	public static void woUsingFlatMap()
	{
		List<List<String>> listOfListOfItems =  packages.stream()
		.map(pack->pack.getItems())
		.collect(Collectors.toList());
		
		System.out.println(listOfListOfItems);
	}
	
	
}

package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class SkipFunction_Understanding {

	
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		

		countries.add("China");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Singapore");
		
		countries.stream()
		.skip(5)
		.forEach(System.out::println);
		
	}
}

package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class LimitFunctionUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countries = new ArrayList<String>();
		

		countries.add("China");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Singapore");
		
		countries.stream()
		.limit(95)
		.forEach(System.out::println);
	}

}

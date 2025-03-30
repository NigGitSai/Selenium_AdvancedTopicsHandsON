package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunc_CountCharEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countries = new ArrayList<String>();
		

		countries.add("China");
		countries.add("USA");
		countries.add("Japan");
		countries.add("Singapore");
		
		List<Integer> countChar =   	countries.stream()
				.skip(2)
		.map(String::length)
		.collect(Collectors.toList());
		
		
		countChar.forEach(System.out::println);
	}

}

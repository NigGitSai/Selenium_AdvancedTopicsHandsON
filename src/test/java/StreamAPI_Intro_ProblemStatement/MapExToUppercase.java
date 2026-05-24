package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

public class MapExToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> input = Arrays.asList("java","spring","stream");
		
	List<String> toUpperCase = 	input.stream().map(String::toUpperCase).toList();
	System.out.println(toUpperCase);
	}

}

package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(11,56,34,22,11,22,22,22);
		System.out.println(intList);
		
		
		intList = 	intList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After removing duplicates");
		
		System.out.println(intList);
	}

}

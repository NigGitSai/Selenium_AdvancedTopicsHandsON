package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctFuncUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Arrays.asList("Apple","Mango","Pineapple","Apple","Pineapple","Jackfruit");
		
		fruits =	fruits.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After removing duplicates");
		
		System.out.println(fruits);
		
		System.out.println("=======================");
		
		System.out.println("Using Print terminal operation ");	
		fruits.stream().distinct().forEach(System.out::println);

	}

}

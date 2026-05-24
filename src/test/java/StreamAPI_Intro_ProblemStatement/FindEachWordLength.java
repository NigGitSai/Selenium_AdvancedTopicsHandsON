package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

public class FindEachWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> input = Arrays.asList("apple", "banana");
		
		List<Integer> result = input.stream().map(s->s.length()).toList();
		
		System.out.println(result);

	}

}

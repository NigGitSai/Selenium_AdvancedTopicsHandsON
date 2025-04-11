package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceFunction_WOIdentity {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Optional<Integer> result =	numbers.stream().reduce((sum,elements)->sum+elements);
		
		System.out.println("Result : "+result);
		
	}
}

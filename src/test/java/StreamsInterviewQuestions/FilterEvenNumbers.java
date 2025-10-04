package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,13,15,22,28,19,33);
		
		List<Integer> evenNumbers = numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers List "+evenNumbers);
	}

}

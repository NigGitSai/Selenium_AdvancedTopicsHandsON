package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class FindSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer sum = numList.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum of all numbers "+sum);
		
		
		Integer product = numList.stream().reduce(1,(a,b)->a*b);
		System.out.println("Product of all numbers "+product);
	}

}

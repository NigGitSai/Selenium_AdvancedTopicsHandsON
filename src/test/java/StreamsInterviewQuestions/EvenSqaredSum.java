package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class EvenSqaredSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,13,15,22,28,19,33);
		
		Integer sumOfSquaredEvenNo = numList.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
		System.out.println(sumOfSquaredEvenNo);
	}

}

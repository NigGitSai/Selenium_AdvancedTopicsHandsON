package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,12,3,4,5,16,77,8,9,13,15,22,28,19);

		Long count = numList.stream().filter(n->n>10).count();
		System.out.println("Count of numbers greater than 10 is "+count);
	}

}

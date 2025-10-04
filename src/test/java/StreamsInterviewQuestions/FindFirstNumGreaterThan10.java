package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumGreaterThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,12,3,4,5,16,77,8,9,13,15,22,28,19);

	  Optional<Integer>	numGreaterThan10 = numList.stream().filter(n->n>10).sorted().findFirst();
	  
	  System.out.println(numGreaterThan10.get());
	}

}

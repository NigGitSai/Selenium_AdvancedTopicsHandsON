package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(1,12,3,4,5,16,97,8,9,13,15,22,28,19);

		Optional<Integer> maxNum = numList.stream().reduce(Integer::max);
		
		System.out.println("Maximum Number in a list "+maxNum.get());

	}

}

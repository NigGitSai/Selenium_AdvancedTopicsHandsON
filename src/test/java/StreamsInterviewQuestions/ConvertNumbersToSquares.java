package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertNumbersToSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,13,15,22,28,19);
 
		List<Integer> numSquareList = numList.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("Squared number list "+numSquareList);
	}

}

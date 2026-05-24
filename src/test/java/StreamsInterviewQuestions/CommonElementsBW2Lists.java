package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CommonElementsBW2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList1 = Arrays.asList(1,2,3,4,5);
		List<Integer> numList2 = Arrays.asList(9,10,11,3,4,5);
		
		List<Integer> resultList = numList1.stream().filter(numList2::contains).toList();
		System.out.println("Common Elements: "+resultList);

	}

}

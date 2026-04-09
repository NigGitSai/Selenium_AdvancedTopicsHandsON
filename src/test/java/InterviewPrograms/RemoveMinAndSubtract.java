package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class RemoveMinAndSubtract {

	@Test
	public void usingStreams() {
		List<Integer> givenList = Arrays.asList(5,4,4,2,2,8);
		while(!givenList.isEmpty()) {
		
		Integer min = givenList.stream()
		.sorted()
		.min(Integer::compare)
		.get();
		 givenList = givenList.stream().map(e->e-min).filter(e->e != 0).collect(Collectors.toList());
		 System.out.println("Minimum number "+min+" list "+givenList);
		}
		
	}
}

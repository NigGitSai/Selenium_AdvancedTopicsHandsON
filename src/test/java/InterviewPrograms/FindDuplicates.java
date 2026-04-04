package InterviewPrograms;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FindDuplicates {

	@Test
	public void usingSet() {
		int[] given = new int[] {1, 2, 3, 4, 2, 3, 5};

		Set<Integer> intList = new HashSet<Integer>();
		ArrayList<Integer>  duplicates = new ArrayList<Integer>();
		for(Integer i: given) {
			if(!(intList.add(i))) {
				duplicates.add(i);
			}
		}
		System.out.println("Duplicates "+duplicates);

	}
	
	@Test
	public void usingStreams() {
		int[] given = new int[] {1, 2, 3, 4, 2, 3, 5};
		Set<Integer> seen = new HashSet<Integer>();
		
		Set<Integer> duplicates = Arrays.stream(given).boxed().filter(s->!seen.add(s))
		.collect(Collectors.toSet());
		System.out.println("Duplicates using streams filter approach \n"+duplicates);	
		List<Integer> ascending = Arrays.stream(given).boxed().sorted().collect(Collectors.toList());
		List<Integer> descending =Arrays.stream(given).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	}
	
	@Test
	public void usingStreamsGrouping() {
		int[] given = new int[] {1, 2, 3, 4, 2, 3, 5};
		Set<Integer> duplicates = Arrays.stream(given).boxed().collect(Collectors.groupingBy(
				Function.identity(),
				Collectors.counting()
				)).entrySet()
				.stream()
				.filter(e->e.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println("Duplicates using streams grouping approach \n"+duplicates);	
		
	}
}

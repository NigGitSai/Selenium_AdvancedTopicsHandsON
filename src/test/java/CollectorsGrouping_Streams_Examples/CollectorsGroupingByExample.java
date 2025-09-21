package CollectorsGrouping_Streams_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> results = Arrays.asList("PASS", "FAIL", "PASS", "FAIL", "PASS");
		
		Map<Object, Long> summary = results.stream().collect(Collectors.groupingBy(r->r,Collectors.counting()));
		System.out.println("Summary: " + summary);	
	}

}

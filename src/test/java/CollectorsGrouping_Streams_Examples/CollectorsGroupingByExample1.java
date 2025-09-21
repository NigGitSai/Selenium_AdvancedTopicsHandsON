package CollectorsGrouping_Streams_Examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = List.of("Selenium", "Java", "Test", "Automation", "QA", "Stream");
		Map<Integer,List<String>> groupByLengthMap =  words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLengthMap);
	}

}

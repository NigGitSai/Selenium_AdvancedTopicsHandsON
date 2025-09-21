package CollectorsGrouping_Streams_Examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCount_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = List.of("Selenium", "Java", "Test", "Automation", "QA", "Stream");

		Map<Integer, Long> groupingCountingMap = words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
		
		System.out.println(groupingCountingMap);
		groupingCountingMap.entrySet().stream().forEach(entry->System.out.println("Key "+entry.getKey()+" value "+entry.getValue()));
	}

}

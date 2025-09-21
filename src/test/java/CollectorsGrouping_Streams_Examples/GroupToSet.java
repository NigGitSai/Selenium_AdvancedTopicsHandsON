package CollectorsGrouping_Streams_Examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> tags = List.of("UI", "API", "UI", "DB");
		Map<Integer,Set<String>> tagsMap = tags.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));
		System.out.println(tagsMap);
	}

}

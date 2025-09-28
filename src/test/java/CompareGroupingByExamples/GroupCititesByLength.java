package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCititesByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cities = Arrays.asList(
				"Paris", "London", "Lisbon", "Los Angeles",
				"Berlin", "Boston", "Brussels",
				"Cairo", "Chicago", "Cape Town",
				"Delhi", "Dubai", "Dublin",
				"Amsterdam", "Athens", "Ankara"
				);

		Map<String,Long> cityLength = 	cities.stream().collect(Collectors.groupingBy(city->city,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(cityLength);
	}

}

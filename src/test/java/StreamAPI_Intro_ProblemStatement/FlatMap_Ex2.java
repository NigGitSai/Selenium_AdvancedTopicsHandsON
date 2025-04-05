package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> hinduFestivals = Arrays.asList("Diwali","Pongal","Ganesh Chathurthi");
		
		List<String> christianFestivals = Arrays.asList("Christmas","New Year");
		
		List<String> muslimFestivals = Arrays.asList("Ramzan","Bakrid");
		
		List<List<String>> festivals = Arrays.asList(hinduFestivals,christianFestivals,muslimFestivals);
		
		System.out.println(festivals);
		
		List<String> finalList = festivals.stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
		System.out.println(finalList);
		
	}

}

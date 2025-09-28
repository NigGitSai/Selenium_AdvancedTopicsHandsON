package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");
		Map<Integer,List<String>> wordMap = words.stream().collect(Collectors.groupingBy(String::length,Collectors.mapping(word->word, Collectors.toList())));
		System.out.println(wordMap);

		Map<Integer,List<String>> wordMap1 = 	words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(wordMap1);
	}

}

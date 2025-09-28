package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = Arrays.asList("apple", "banana", "cherry", "avocado");

		Map<Character,List<String>> wordMap =	words.stream().collect(Collectors.groupingBy(word -> Character.toLowerCase(word.charAt(0))));

		System.out.println(wordMap);
	}

}

package Streams_API_Examples;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class WordsAndLengthCountUsingCollectorsToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> words = List.of("Selenium", "Java", "Test", "Automation", "QA", "Stream");
		 
		 Map<String,Integer> wordsAndTheirLengthCount = words.stream().collect(Collectors.toMap(word->word, String::length));
		 System.out.println(wordsAndTheirLengthCount);
		 
		 //If we want it to be sorted
		 Map<String,Integer> wordsAndTheirLengthCountSortedMap = words.stream().collect(Collectors.toMap(word->word, String::length,(oldVal, newVal) -> newVal,TreeMap::new));
		 System.out.println("Sorted Map");
		 System.out.println(wordsAndTheirLengthCountSortedMap);
		 
		 //To preserve insertion order
		 System.out.println("To preserve insertion order");
		 Map<String,Integer> wordsAndTheirLengthCountMap3 =  words.stream().collect(Collectors.toMap(word->word, String::length,(oldval,newval)->newval,LinkedHashMap::new));
		 System.out.println(wordsAndTheirLengthCountMap3);
	}

}

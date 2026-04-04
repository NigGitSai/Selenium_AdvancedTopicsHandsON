package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FindNonRepeatingChar {

	@Test(enabled = false)
	public void usingLinkedHashMap() {
		// String s = "Selenium";
		String s = "aabb";
		char result = firstNonRepeatingChar(s);

		System.out.println("First non repeating charchter is " + result);

	}

	@Test
	public void usingIntArray() {
		String s = "Selenium";
		char result = firstNonRepeatingChar(s);
		System.out.println("First non repeating charchter is " + result);
	}
	
	@Test
	public void usingStreams(){
		String s = "Selenium";
		char firstNonRepeatingChar = s.chars()
         .mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy(
                 Function.identity(),
                 LinkedHashMap::new,
                 Collectors.counting()))
         .entrySet()
         .stream()
         .filter(entry -> entry.getValue() == 1)
         .map(Map.Entry::getKey)
         .findFirst()
         .orElse('_');
		
		System.out.println("First non repeating charachter is "+firstNonRepeatingChar);
	}

	private Character usingIntArrayHelper(String str) {
		if (str.isEmpty() || str.isBlank() || str == null) {
			System.out.println("The string passed is not valid");
			return '_';
		}
		/**
		 * This creates an array of size 256 Each index represents a character (ASCII
		 * value) Default value of each element = 0
		 */
		int[] freq = new int[256];
//freq[0]=0.freq[65]=2,freq[255]=0
		//Abc
		for (char ch : str.toCharArray()) {
			freq[ch]++; //freq[65]=1
		}
		for (char ch : str.toCharArray()) {
			if (freq[ch] == 1) {
				return ch;
			}
		}
		return '_';
	}

	private Character firstNonRepeatingChar(String str) {
		if (str.isEmpty() || str.isBlank() || str == null) {
			System.out.println("The string passed is not valid");
			return '_';
		}
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		System.out.println("No non repeating charachter is found ");
		return '_';
	}

}

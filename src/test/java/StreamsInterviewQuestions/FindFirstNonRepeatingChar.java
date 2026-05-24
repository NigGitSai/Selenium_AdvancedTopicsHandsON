package StreamsInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbcdde";
		
		Character result = str.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(
				c->c,
				LinkedHashMap::new,
				Collectors.counting()
				))
		.entrySet()
		.stream()
		.filter(f->f.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
		
		System.out.println("First non repeating char is :"+result);
		
	}

}

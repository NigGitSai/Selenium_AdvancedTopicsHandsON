package JavaPrograms;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FrequencyOfCharachters {
	
	@Test(enabled=false)
	public void findFrequencyOfChar()
	{
		String str = "Parrot is green color";
		
		String[] words = str.split(" ");
		
		LinkedHashMap<Character,Integer> letterMap = new LinkedHashMap<Character,Integer>();
		
		for(String word: words)
		{
			char[] charArr = word.toCharArray();
			
			for(int i=0; i<charArr.length;i++)
			{
				if(letterMap.get(charArr[i])==null)
				{
					letterMap.put(charArr[i], 1);
				}
				else
				{
					letterMap.put(charArr[i], letterMap.get(charArr[i])+1);
				}
			}
		}
		
		System.out.println("The result map is "+letterMap);
		
	}
	
	@Test
	public void findFrequencyOfCharUsingStrems()
	{
		String given = "Parrot is green color";
		
		Map<Character,Long> resultMap = given.chars().mapToObj(c->(char)c).filter(c->c!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		resultMap.forEach((k,v)->System.out.println(k+" has occurence "+v));
		
	}

}

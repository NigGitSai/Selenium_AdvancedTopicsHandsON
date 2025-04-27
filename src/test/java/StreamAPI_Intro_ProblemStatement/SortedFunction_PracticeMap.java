package StreamAPI_Intro_ProblemStatement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class SortedFunction_PracticeMap {
	
	@Test
	public void sortMapByKeysInAscendingOrder()
	{
		LinkedHashMap<String, Integer> map1		=new LinkedHashMap<String,Integer>();
	      
	      map1.put("Z", 20);
	      map1.put("B", 10);
	      map1.put("S", 6);
	      map1.put("D", 98);
	      
	  LinkedHashMap<String,Integer> sortedMap =    map1.entrySet().stream().sorted(Map.Entry.comparingByKey())
			  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	   System.out.println("After sorting in ascending order by keys :"+sortedMap);   
	}
	
	@Test
	public void sortMapByKeysInDescendingOrder()
	{
		LinkedHashMap<String, Integer> map1		=new LinkedHashMap<String,Integer>();
	      
	      map1.put("Z", 20);
	      map1.put("B", 10);
	      map1.put("S", 6);
	      map1.put("D", 98);
	      
	      System.out.println("Sort by keys in Descending order");
	     LinkedHashMap<String,Integer> sortedMap =  map1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	      .collect(Collectors.toMap(
	                Map.Entry::getKey,
	                Map.Entry::getValue,
	                (e1, e2) -> e1,                  // merge function, in case of key collision
	                LinkedHashMap::new               // supplier to keep insertion order
	            ));
	      System.out.println(sortedMap);
	}
	
	@Test
	public void sortMapByValuesInAscendingOrder()
	{
		LinkedHashMap<String, Integer> map1		=new LinkedHashMap<String,Integer>();
	      
	      map1.put("Z", 20);
	      map1.put("B", 10);
	      map1.put("S", 6);
	      map1.put("D", 98);
	      System.out.println("Sort by Values in Ascending order");
	      
	       LinkedHashMap<String, Integer> sortByValues =   map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
	      .collect(Collectors.toMap(Map.Entry::getKey,
	                Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
	       
	       System.out.println(sortByValues);
	}
	
	@Test
	public void sortMapByValuesInDescendingOrder()
	{
		LinkedHashMap<String, Integer> map1		=new LinkedHashMap<String,Integer>();
	      
	      map1.put("Z", 20);
	      map1.put("B", 10);
	      map1.put("S", 6);
	      map1.put("D", 98);
	      System.out.println("Sort by Values in Descending order");
	      
	       LinkedHashMap<String, Integer> sortByValues =   map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	      .collect(Collectors.toMap(Map.Entry::getKey,
	                Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
	       
	       System.out.println(sortByValues);
	}

}

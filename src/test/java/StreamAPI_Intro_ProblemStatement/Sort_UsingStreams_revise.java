package StreamAPI_Intro_ProblemStatement;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Sort_UsingStreams_revise {
	
	@Test
	public void sortByValuesAscending()
	{
      HashMap<String, Integer> map1		=new HashMap<String,Integer>();
      
      map1.put("A", 20);
      map1.put("B", 10);
      map1.put("C", 6);
      map1.put("D", 98);
      System.out.println("before sorting");
      map1.forEach((key,value)->System.out.println(key+" "+value));
      
      
        Map<Object, Object> sortedMap = map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println("After sorting values in ascending order");
       
        sortedMap.forEach((key,value)->System.out.println(key+" "+value));
	}
	
	@Test
	public void sortByKeysAscending()
	{
      HashMap<String, Integer> map1		=new HashMap<String,Integer>();
      
      map1.put("Z", 20);
      map1.put("B", 10);
      map1.put("S", 6);
      map1.put("D", 98);
      System.out.println("before sorting");
      map1.forEach((key,value)->System.out.println(key+" "+value));
      
      
      Map<Object, Object> sortedMap =    map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
      System.out.println("After sorting keys in ascending order");
      
       
       sortedMap.forEach((key,value)->System.out.println(key+" "+value));
	}

	@Test
	public void sortByValuesDescending()
	{
		 HashMap<String, Integer> map1		=new HashMap<String,Integer>();
	      
	      map1.put("Z", 20);
	      map1.put("B", 10);
	      map1.put("S", 6);
	      map1.put("D", 98);
	      
	      System.out.println("Before Sorting");
	      map1.forEach((key,value)->System.out.println(key +" "+value));
	  LinkedHashMap<String, Integer>  sortedMap =  map1.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	
	  System.out.println("After sorting values in descending order");
	  sortedMap.forEach((key,value)->System.out.println(key+" "+value));
	
	}
}

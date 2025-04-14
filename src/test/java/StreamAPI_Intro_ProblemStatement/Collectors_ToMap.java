package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Collectors_ToMap {

	@Test
	public void Collectors_ToMapEx()
	{
		
		
		  List<String> colors =   Arrays.asList("Orange","White","Blue","Red");
		  
		 Map<String, Integer> map1 =    colors.stream().collect(Collectors.toMap(name->name, String::length));
		
		 for (Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		 
		
	}
	
	@Test
	public void Collectors_ToMap_HandlingDuplicatedEx()
	{
		
		
		  List<String> colors =   Arrays.asList("Orange","White","Blue","Red","White");
		  
		 Map<String, Integer> map1 =    colors.stream().collect(Collectors.toMap(name->name, String::length,(key1,key2)->key1 ));
		
		System.out.println("Handling Duplicate");
		 for (Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	@Test
	public void Collectors_ToMap_HandlingDuplicatedEx2()
	{
		
		
		  List<String> colors =   Arrays.asList("Orange","White","Blue","Red","White");
		  
		 Map<String, Integer> map1 =    colors.stream().distinct().collect(Collectors.toMap(name->name, String::length));
		
		System.out.println("Handling Duplicate using Distinct function");
		 for (Entry<String, Integer> entry : map1.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	

	@Test
	public void Collectors_ToMapEx_FromIdentity()
	{
		
		
		  List<String> colors =   Arrays.asList("Orange","White","Blue","Red");
		  
		 Map<String, Integer> map1 =    colors.stream().collect(Collectors.toMap(Function.identity(), String::length));
		
		 map1.forEach((key,value)->System.out.println(key+" :"+value));
		
	}
	
	
}

package Collections_JavaHandsON;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class HashMapTest {
	
	@Test
	public void hashMapTest()
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Rahul");
		hm.put(2, "Zara");
		hm.put(3, "Vrushall");
		
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.entrySet());
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
	
		}
	}

}

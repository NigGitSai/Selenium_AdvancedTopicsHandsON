package Collections_JavaHandsON;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayListTestRemove {

	@Test
	public void removeTest()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("bat");
		al.add("apple");
		al.add("Apple");
		al.add("pudding");
		
		System.out.println(al);
		
		al.remove("apple");
		
		System.out.println("after removing apple :"+al);
		
	}
}

package Collections_JavaHandsON;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayListSetTest {

	@Test
	public void setTest()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("bat");
		al.add("apple");
		al.add("Apple");
		al.add("pudding");
		
		al.set(0,"monkey");
		
		System.out.println(al);
	}
}

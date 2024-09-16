package Collections_JavaHandsON;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("A");
		hs1.add("B");
		hs1.add("A");
		hs1.add(null);
		hs1.add("d");
		hs1.add("e");
		
		Iterator<String> iterate = hs1.iterator();
		
		System.out.println("Using Iterator");
		System.out.println("=============");
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
		
		System.out.println("Using For Each Loop");
		System.out.println("=============");
		for(String temp:hs1)
		{
			System.out.println(temp);
		}
		
		
	}

}

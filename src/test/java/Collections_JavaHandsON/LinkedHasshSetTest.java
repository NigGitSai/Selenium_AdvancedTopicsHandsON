package Collections_JavaHandsON;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasshSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs1 = new LinkedHashSet<>();
		
		lhs1.add(1);
		lhs1.add("A");
		lhs1.add("B");
		lhs1.add("a");
		lhs1.add("A");
		lhs1.add("C");
		lhs1.add(null);
		
		System.out.println("linked Hashset without generics :"+lhs1);
		
		lhs1.remove("C");
		
		System.out.println("After removing C :"+lhs1);
		
		System.out.println("Calling isEmpty() function :"+lhs1.isEmpty());
		
		Set<String> linkedHashSet2 = new LinkedHashSet<String>();
		linkedHashSet2.add("twinkle");
		linkedHashSet2.add("star");
		
		System.out.println("linked Hashset with generics :"+linkedHashSet2);
		
		System.out.println("Using Iterator");
		Iterator iterator = linkedHashSet2.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}

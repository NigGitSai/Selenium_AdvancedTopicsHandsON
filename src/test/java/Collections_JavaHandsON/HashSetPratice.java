package Collections_JavaHandsON;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet<String> hs1 = new HashSet<String>();
			
			hs1.add("A");
			hs1.add("B");
			hs1.add("A");
			hs1.add(null);
			hs1.add("d");
			hs1.add("e");
			
			
			System.out.println("Hashset hs1 :"+hs1);
			
			System.out.println("to check Hashset contains null element :"+hs1.contains(null));
			
			hs1.remove("e");
			System.out.println("Hashset hs1 :"+hs1);
			
			System.out.println("Is Empty function :"+hs1.isEmpty());
		
			
			
	}

}

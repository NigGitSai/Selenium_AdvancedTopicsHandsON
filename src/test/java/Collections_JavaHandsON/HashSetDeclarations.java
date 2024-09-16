package Collections_JavaHandsON;

import java.util.HashSet;
import java.util.Set;

public class HashSetDeclarations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("A");
		hs1.add("B");
		hs1.add("A");
		hs1.add(null);
		hs1.add("d");
		hs1.add("e");
		
		HashSet<String> hs2 = new HashSet<String>(hs1);
		
		System.out.println("Print elements of hs2 :"+hs1);
		
		Set<String> hs3 = new HashSet<String>();
		
		hs3.addAll(hs2);
		hs3.add("table");
		hs3.add("mango");
		System.out.println("hash Set 3 :"+hs3);
		
		hs3.retainAll(hs2);
		
		System.out.println("After retaining only hs2 collection : "+hs3);
		
		Set hs4 = new HashSet<>();
		
		hs4.add("Cat");
		hs4.add(2);
		
		System.out.println("Hash Set with out generics :"+hs4);
	}

}

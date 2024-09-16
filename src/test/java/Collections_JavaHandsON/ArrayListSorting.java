package Collections_JavaHandsON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(0);
		intList.add(2);
		Collections.sort(intList);
		
		System.out.println(intList);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("mango");
		al.add("apple");
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}

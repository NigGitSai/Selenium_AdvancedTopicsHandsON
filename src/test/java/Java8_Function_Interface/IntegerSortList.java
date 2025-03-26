package Java8_Function_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		intList.add(9);
		intList.add(22);
		
		Collections.sort(intList);
		
		System.out.println("After sorting");

		for(Integer il: intList)
		{
			
			System.out.println(il);
		}
	}

}

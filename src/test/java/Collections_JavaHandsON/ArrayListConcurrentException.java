package Collections_JavaHandsON;

import java.util.ArrayList;

public class ArrayListConcurrentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("apple");
		al.add("mango");
		
		for(String temp: al)
		{
			System.out.println(al);
			al.add("orange");
		}
	}
}

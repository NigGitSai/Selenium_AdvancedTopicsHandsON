package Collections_JavaHandsON;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListVS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> al = new ArrayList<String>();
		
		al.add("apple");
		al.add("mango");
		
		Object[] strArr = al.toArray() ;
		
		String[] s1 = {"a","cat","table","pen"};
		
		 ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(s1));
		 
		 System.out.println(al2.get(1));
		 for(String temp:al2)
		 {
			 System.out.println(temp);
		 }
	}

}

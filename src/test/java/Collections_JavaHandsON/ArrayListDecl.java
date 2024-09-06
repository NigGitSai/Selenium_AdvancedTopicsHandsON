package Collections_JavaHandsON;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDecl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Without generics
		List li = new ArrayList();
		
		li.add(3);
		li.add("fruit");
		System.out.println(li);
		
		ArrayList al = new ArrayList();
		al.add("raise");
		al.add(96);
		
		System.out.println(al);
		
		List<Object> li2 = new ArrayList<Object>(li);
		System.out.println(li2);
		
		Object[] ol = li2.toArray();
		
		for(Object temp:ol)
		{
			System.out.println(temp);
		}
		
		
		
	}

}

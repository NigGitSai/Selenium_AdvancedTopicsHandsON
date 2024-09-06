package Collections_JavaHandsON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ArrayListTest {

	@Test
	public  void withIntegerGenerics(){
		// TODO Auto-generated method stub

		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(0);
		intList.add(2);
		
		System.out.println(intList);
		
		//get
		
		System.out.println("0th index "+intList.get(0));
		
		System.out.println("Index position of element 0 is "+intList.indexOf(0));
		intList.add(1, 10);
		System.out.println(intList);
		
		intList.add(3);
		intList.add(1);
		System.out.println(intList);
		
		System.out.println("Index position of element 1 is "+intList.indexOf(1));
		System.out.println("Index position of element 1 is "+intList.lastIndexOf(1));
		System.out.println("Before removing :"+intList);
		
		
		intList.remove(0);
		
		
		//Important though remove function is an overloaded method remove(int index) and remove(Object O)
		//As we have integer list in this example though we pass 0 ( which is also an element in the list)
		//it will remove element in 0 th index
		System.out.println("After removing 0th index element :"+intList);
		
		intList.set(0, 4);
		System.out.println("After replacing 0th index element with 4 "+intList);
		
		System.out.println("Verify 2 is available in this list "+intList.contains(2));
		System.out.println("Verify 61 is available in this list "+intList.contains(61));
		
		//Retreiving the index of element which does not exist
		System.out.println("Index position of element 100 is "+intList.indexOf(100));
		System.out.println("Index position of element 100 is "+intList.lastIndexOf(100));
		
		System.out.println("To check if arraylist is empty "+intList.isEmpty());
		
		
		List<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(99);
		intList2.add(102);
		intList2.addAll(intList);
		
		System.out.println("Second list");
		System.out.println(intList2);
		
		List<Integer> intList3 = new ArrayList<Integer>();
		
		intList3.add(22);
		intList3.add(23);
		intList3.addAll(0, intList);
		
		System.out.println("Third list");
		System.out.println(intList3);
		
		intList3.removeAll(intList);
		
		System.out.println("After removing the first list items for list3");
		System.out.println(intList3);
		for( int i =0;i< intList.size();i++)
		{
			System.out.println("Normal for loop :"+intList.get(i));
		}
		
		for(int temp: intList)
		{
			System.out.println("usingfor each :"+temp);
		}
		
		ListIterator list_Iterator = intList.listIterator();
		System.out.println("Using List Iterator");
		
		while(list_Iterator.hasNext())
		{
		
			System.out.print(list_Iterator.next());
		}
		
		System.out.println("========================");
		System.out.println("Using List Iterator with previous function reverse traversing");
		while(list_Iterator.hasPrevious())
		{
			
			System.out.print(list_Iterator.previous());
		}
		
		System.out.println("========================");
		ListIterator list_Iterator1 = intList.listIterator(2);
		System.out.println("Using List Iterator passing index as 2");
		while(list_Iterator1.hasNext())
		{
			
			System.out.print(list_Iterator1.next());
		}
		
		System.out.println("========================");
		
		System.out.println("Using Iterator");
		Iterator iterator = intList.iterator();
		
		while(iterator.hasNext())
		{
		
			System.out.print(iterator.next());
		}
	}

}


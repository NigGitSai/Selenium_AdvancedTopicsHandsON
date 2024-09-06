package Collections_JavaHandsON;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkedListIterator {
	LinkedList<String> l1;
	@BeforeTest()
	public void initializeList()
	{
		 l1 = new LinkedList<String>();
		
		l1.add("pen");
		l1.add("eraser");
		l1.add("ink");
		l1.add("stapler");
		
		System.out.println("Linked list after adding elements :"+l1);
		
	}
	
	@Test(priority = -4,enabled = true)
	public void usingForEachLoop()
	{
		System.out.println("Using For Each Loop");
		
		for(String temp: l1)
		{
			System.out.println(temp);
		}
		System.out.println("=======================================");
	}

	@Test(priority = -3,enabled = true)
	public void usingForLoop()
	{
		System.out.println("Using For  Loop");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("=======================================");
	}
	
	@Test(priority = -1,enabled = true)
	public void usingListIterator()
	{
		System.out.println("Using List Iterator");
		ListIterator lstIterator = l1.listIterator();
		while(lstIterator.hasNext())
		{
			System.out.println(lstIterator.next());
			
		}
		System.out.println("=======================================");
	}

	
	
	
	@Test(priority = 3,enabled = true)
	public void usingIterator()
	{
		System.out.println("Using  Iterator");
		Iterator Iterator = l1.iterator();
		while(Iterator.hasNext())
		{
			System.out.println(Iterator.next());
			
		}
		System.out.println("=======================================");
	}
	
	@Test(priority = 4,enabled = true)
	public void usingDescendingIterator()
	{
		System.out.println("Using Descending  Iterator");
		Iterator Iterator = l1.descendingIterator();
		while(Iterator.hasNext())
		{
			System.out.println(Iterator.next());
			
		}
		System.out.println("=======================================");
	}

}

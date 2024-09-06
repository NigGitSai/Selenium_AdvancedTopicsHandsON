package Collections_JavaHandsON;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class LinkedListDeclarations {
	
	@Test
	public void linkedListDeclarations()
	{
		/**
		 * Important as List Reference only methods available in List Interface can be called
		 * 
		 *  addFirst, addLast, peek and poll, getFirst, getLast cannot be called.
		 *  
		 */
		
		
		List l1 = new LinkedList();
		l1.add(15);
		l1.add("ac");
		
		System.out.println("Without Generics as List reference :"+l1);
		
		List<String> l2 = new LinkedList<String>();
		l2.add(0,"abc");
		System.out.println("With Generics as List Reference :"+l2);
		
		LinkedList l3 = new LinkedList<>();	
		
		l3.add(2);
		l3.addFirst("hen");
		System.out.println("Without generics as Linked List reference  :"+l3);
		
		LinkedList<Integer> l4 = new LinkedList<Integer>();
		l4.add(null);
		l4.add(21);
		l4.addLast(78);
		System.out.println("With generics as Linked List reference  :"+l4);
		
		LinkedList<Integer> l5 = new LinkedList<Integer>(l4);
		
		l4.set(0, 64);
		System.out.println("Linked List L5 :"+l5);
		System.out.println("Linked list L4 :"+l4);
		System.out.println("Minimum number of Linked List L4 :"+Collections.min(l4));
		
		System.out.println("Maximum number of Linked List L4 :"+Collections.max(l4));
		
		LinkedList<Integer> l6 = new LinkedList<Integer>();
		l6.addAll(l4);
		System.out.println("Linked list L6 after calling add all method :"+l6);
		System.out.println("Checking l4 is equal to l6 :"+l4.equals(l6));
		l6.add(54);
		System.out.println("Linked list L6 after adding 54 element :"+l6);
		l6.removeAll(l4);
		System.out.println("Linked list L6 after calling remove all method :"+l6);
		
	}

}

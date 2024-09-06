package Collections_JavaHandsON;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedListTest {

	@Test
	public void withIntegerGeneric()
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		System.out.println(linkedList);
		
		linkedList.add(1, 4);
		
		System.out.println("=========================================");
		
		System.out.println("After Adding 4 in 1st index :"+linkedList);
		
		linkedList.addFirst(0);
		
		linkedList.addLast(null);
		System.out.println("=========================================");
		
		System.out.println("After Adding 0 and null using addFist and addLast method :"+linkedList);
		
		linkedList.remove();
		System.out.println("=========================================");
		System.out.println("Linked list remove function :"+linkedList.remove());
		System.out.println("After removing :"+linkedList);
		
		linkedList.add(2,0);
		System.out.println("=========================================");
		System.out.println("Linked list after inserting 0 in 2 index :"+linkedList);
		linkedList.remove(0);
		System.out.println("=========================================");
		System.out.println("After removing 0th index  :"+linkedList);
		
		linkedList.remove((Object)0);
		
		System.out.println("After removing 0 element  :"+linkedList);
		linkedList.add(0);
		linkedList.add(2,0);
		linkedList.add(51);
		System.out.println("=========================================");
		System.out.println("To verify linked list accepts duplicates :"+linkedList);
		
		System.out.println("=========================================");
		System.out.println("calling  remove First method :"+linkedList.removeFirst());
		
		System.out.println("Linked list after calling removeFirst method :"+linkedList);
		
		linkedList.removeLastOccurrence(0);
		
		System.out.println("After removeing 0 in last occurence :"+linkedList);
		
		linkedList.add(0);

		linkedList.removeFirstOccurrence(0);
		
		System.out.println("After removeing 0 in first occurence :"+linkedList);
		
		linkedList.add(29);

		linkedList.add(81);
		
		

		System.out.println("After radding 29 and 81 :"+linkedList);
		
			System.out.println("calling  remove last method :"+linkedList.removeLast());
		
		System.out.println("Linked list after calling removeLast method :"+linkedList);
		System.out.println("=========================================");
		
		System.out.println("Retreiving 2 index element :"+linkedList.get(2));
		
		System.out.println("Retreiving first element :"+linkedList.getFirst());
		
		System.out.println("Retreiving last element :"+linkedList.getLast());
		System.out.println("=========================================");
		
		System.out.println("calling  peek() method :"+linkedList.peek());
		
		System.out.println("Linked list after calling peek() method :"+linkedList);
	
		System.out.println("calling  peekFirst()  method :"+linkedList.peekFirst());
		
		System.out.println("Linked list after calling peekFirst() method :"+linkedList);
		
		System.out.println("calling  peekLast()  method :"+linkedList.peekLast());
		
		System.out.println("Linked list after calling peekLast() method :"+linkedList);
		System.out.println("=========================================");
		
		System.out.println("calling  poll() method :"+linkedList.poll());
		
		System.out.println("Linked list after calling poll() method :"+linkedList);
	
		System.out.println("calling  pollFirst()  method :"+linkedList.pollFirst());
		
		System.out.println("Linked list after calling pollFirst() method :"+linkedList);
		
		System.out.println("calling  pollLast()  method :"+linkedList.pollLast());
		
		System.out.println("Linked list after calling pollLast() method :"+linkedList);
		
		System.out.println("=========================================");
		
		System.out.println("Calling isEmpty() method :"+linkedList.isEmpty());
		
		System.out.println("=========================================");
		System.out.println("Printing Linked List :"+linkedList);
		linkedList.set(1,99);
		
		
		
		System.out.println("After setting 99 in second index :"+linkedList);
		
		System.out.println("Index of 99 : "+linkedList.indexOf(99));
		
		linkedList.add(99);
		
		System.out.println("Adding 99 again and calling last Index of method :"+linkedList.lastIndexOf(99));
		
		
	}
}


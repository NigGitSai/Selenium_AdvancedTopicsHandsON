package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeListsAndRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = Arrays.asList(1,2,3,4,4,4,2,5);
		List<Integer> listB = Arrays.asList(1,23,3,3,6,0,9);
		List<Integer> resultList = Stream.concat(listA.stream(), listB.stream()).distinct().toList();
		System.out.println("Final list "+resultList);
	
	}

}

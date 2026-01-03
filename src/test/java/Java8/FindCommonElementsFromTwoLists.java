package Java8;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsFromTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = Arrays.asList(11,4,6,99,10);
		List<Integer> listB = Arrays.asList(32,10,89,4,1);
		List<Integer> listC = listA.stream().filter(listB::contains).toList();
		System.out.println("Common numbers :"+listC);
	}

}

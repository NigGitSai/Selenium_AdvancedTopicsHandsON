package InterviewPrograms.Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,1,2,1,3,4,5};
		int[] arr2 = {2,3,4,5,6};
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		for(int i=0;i<arr1.length;i++) {
			treeSet.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			treeSet.add(arr2[i]);
		}
		
		
		
		int[] union =treeSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("Union of 2 arrays :"+Arrays.toString(union));
	}

}

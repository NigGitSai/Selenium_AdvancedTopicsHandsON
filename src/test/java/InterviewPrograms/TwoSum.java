package InterviewPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] given = {1,2,3,4};

		int target = 5;
		
		TwoSum twoSum = new TwoSum();
		int[] result = twoSum.findIndex(given,target);

		System.out.println("Result indexes are :"+Arrays.toString(result));
	}

	private int[] findIndex(int[] given,int target) {

		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		
		for(int i=0;i<given.length;i++) {
			int diff = target-given[i];
			if(map.containsKey(diff)) {
				return new int[] {i,map.get(diff)};
			}
			
			map.put(given[i], i);
		}
		return new int[] {};

	}

}

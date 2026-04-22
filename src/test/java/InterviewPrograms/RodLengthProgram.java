package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RodLengthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rods = {1,1,2,5};
		Arrays.sort(rods);
		ArrayList<Integer> rodList = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		for(Integer i: rods) {
			rodList.add(i);
		}
		while(!rodList.isEmpty()) {
			int min = rodList.get(0);
			result.add(rodList.size());
			ArrayList<Integer> next = new ArrayList<>();
			for(Integer rod: rodList) {
				if(rod==min) {
					
				}
				else {
					next.add(rod-min);
				}
			}
			rodList = next;
		}
	}

}

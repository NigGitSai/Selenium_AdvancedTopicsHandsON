package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		List<List<Integer>> result = getSubArrays(arr);
		System.out.println(result);

	}

	public static List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> allSubarrays = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> currentSubarray = new ArrayList<>();
            
            for (int j = i; j < arr.length; j++) {
                // Continuously add the next element to the current sequence
                currentSubarray.add(arr[j]);
                // Create a copy to save the current state
                allSubarrays.add(new ArrayList<>(currentSubarray));
            }
        }
        return allSubarrays;
    }

}

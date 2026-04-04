package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.Test;

public class FindSecondLargestNumberInArray {

	@Test
	public void usingStreams() {
		int[] arr = new int[] {12,89,33,10,7,5,88};
		int secondLargest =	Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest number "+secondLargest);
	}

	@Test
	public void usingForLoop() {
		int[] arr = new int[] {12,89,33,10,7,5,88};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Second largest number using for loop "+arr[1]);
	}
	
	@Test
	public void usingCollections() {
		int[] arr = new int[] {12,109,33,10,7,5,92};
		
		List<Integer> intList = Arrays.asList(ArrayUtils.toObject(arr));
		Collections.sort(intList,Collections.reverseOrder());
		System.out.println("Intlist "+intList);
		System.out.println("Second largest number using collections "+intList.get(1));
		
	}
}

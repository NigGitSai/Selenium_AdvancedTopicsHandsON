package InterviewPrograms.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 2, 2, 3, 4, 4};

	        int i = 0; // points to last unique element

	        for (int j = 1; j < arr.length; j++) {
	        	System.out.println(" i value "+i+" j value "+j);
	        	System.out.println(" arr[i] "+arr[i]+" arr[j]"+arr[j]);

	            if (arr[j] != arr[i]) {
	                i++;              // move i forward
	                arr[i] = arr[j]; // place new unique element
	                System.out.println("Arrays :"+Arrays.toString(arr));
	            }
	            
	        }

	        // i + 1 = number of unique elements
	        System.out.println("Unique count: " + (i + 1));
	       // System.out.println("Array: " + Arrays.toString(arr));
	        System.out.println("Result is : "+Arrays.toString(Arrays.copyOf(arr, i + 1)));
	}

}

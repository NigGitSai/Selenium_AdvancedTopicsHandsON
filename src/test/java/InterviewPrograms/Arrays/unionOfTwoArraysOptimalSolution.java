package InterviewPrograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class unionOfTwoArraysOptimalSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,2,1,3,4,5};

		int[] arr2 = {2,3,4,5};
		
		 Arrays.sort(arr1); // IMPORTANT
	        Arrays.sort(arr2);

		//expected op {1,2,3,4,5}

		int i=0;
		int j=0;

		int n1= arr1.length;
		int n2 = arr2.length;
		List<Integer> unionList = new ArrayList<Integer>();
		
		while(i < n1 && j<n2) {
			if(arr1[i] == arr2[j]) {
				if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr1[i]) {
					unionList.add(arr1[i]);
				}
				i++;
				j++;
			}
			
			else if(arr1[i] < arr2[j]) {
				if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr1[i]) {
					unionList.add(arr1[i]);
				}
				i++;
			}
			else {
				if(unionList.isEmpty() || unionList.get(unionList.size()-1) != arr2[j]) {
					unionList.add(arr2[j]);
				}
				j++;
			}
		}
		
		while(i < n1) {
			if(unionList.get(unionList.size()-1) != arr1[i]) {
				unionList.add(arr1[i]);
			}
			i++;
		}
		
		while(j < n2) {
			if(unionList.get(unionList.size()-1) != arr2[j]) {
				unionList.add(arr2[j]);
			}
			j++;
		}
		
		System.out.println("Union list :"+unionList);
	}

}

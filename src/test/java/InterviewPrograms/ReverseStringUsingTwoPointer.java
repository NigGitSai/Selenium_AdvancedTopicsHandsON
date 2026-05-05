package InterviewPrograms;

import java.util.Arrays;

public class ReverseStringUsingTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello";
			char[] x = input.toCharArray();
			StringBuilder sb = new StringBuilder();
		for(int i=x.length-1;i>=0;i--) {
			sb = sb.append(x[i]);
		}
		System.out.println(sb.toString());
		
		char[] y = input.toCharArray();
		
		int left=0;
		int right=y.length-1;
		while(left<right) {
			char tmp = y[left];
			y[left] = y[right];
			y[right]= tmp;
			left++;
			right--;
		}
		
		System.out.println(" Method 2 ");
		System.out.println(Arrays.toString(y));
		StringBuilder sb2 = new StringBuilder(Arrays.toString(y));
		System.out.println("Sb2 "+sb2.toString());
	}

}

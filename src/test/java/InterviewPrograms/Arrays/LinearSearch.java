package InterviewPrograms.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5,6,7,4,9,4};
		
		int n = 4;
		for(int i=0;i<num.length;i++) {
			if(num[i]== n) {
				System.out.println("First occurence of "+n+" in the given array is :"+i);
				return;
			}
		}
		System.out.println("No occurences of "+n+" in the given array");
		return;
		

	}

}

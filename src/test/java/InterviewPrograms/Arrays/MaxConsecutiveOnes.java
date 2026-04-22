package InterviewPrograms.Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,0,1,1,1,0,1,1};
		
	int counter=0;
		int maxLength =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				counter++;
				if(counter > maxLength) {
					maxLength = counter;
				}
			}
			else {
				counter = 0;
			}
		}
		
		System.out.println("Maximum consecutive 1's are : "+maxLength);
	}

}

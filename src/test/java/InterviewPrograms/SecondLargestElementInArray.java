package InterviewPrograms;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[] {5,1,2,8,10,10,2};
		int largest = num[0];
		int sLargest = -1;
		for(int i=1;i<num.length-1;i++) {
			if(num[i]>largest) {
				sLargest = largest;
				largest = num[i];
			}
			else if(num[i] < largest && num[i] > sLargest) {
				sLargest = num[i];
			}
		}
		System.out.println("Secod largest number is "+sLargest);
	}

}

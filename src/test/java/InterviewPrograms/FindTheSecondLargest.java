package InterviewPrograms;

public class FindTheSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {19,-61,77,77,52,33,-2,9};
		
		int largest = num[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i =1;i<num.length-1;i++) {
			if(num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			}else if(num[i]< largest && num[i]>secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("Second largest in an array "+secondLargest);
		
		for(int i=0;i<num.length-1;i++) {
			if(num[i]>largest) {
				largest = num[i];
			}
		}
		System.out.println("Largest element in an array "+largest);
	}

}

package InterviewPrograms.Arrays;

public class MissingNumberOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,5};
		
		int n=5;
		
		int sum = (n*(n+1))/2;
		int sum2 =0;
		System.out.println("Sum : "+sum);
		for(int i=0;i<arr.length;i++) {
			sum2 = sum2+arr[i];
		}
		System.out.println("Sum 2 : "+sum2);

		int missingNumber = sum - sum2;
		
		System.out.println("Missing number is :"+missingNumber);
	}

}

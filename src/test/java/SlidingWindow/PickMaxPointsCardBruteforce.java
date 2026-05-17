package SlidingWindow;

public class PickMaxPointsCardBruteforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {6,2,3,4,7,2,1,7,1};
		
		int lSum = 0,rSum=0, maxSum = 0;
		int k=4;
		for(int i=0;i<k;i++) {
			lSum = lSum+arr[i];
		}
		
		maxSum = lSum;
		
		int rIndex = arr.length-1;
		
		for(int i=k-1;i>=0;i--) {
			lSum = lSum-arr[i];
			rSum= rSum+arr[rIndex];
			rIndex = rIndex -1;
			maxSum = Math.max(maxSum,lSum+rSum);
		}
		System.out.println("Max Sum :"+maxSum);
	}

}

package InterviewPrograms.Arrays;

public class MissingNumberBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,4,5};
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int flag = 0;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("The missing number is :"+i);
				return;
			}
		}

	}

}

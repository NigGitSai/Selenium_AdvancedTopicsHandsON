package InterviewPrograms;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {5,1,2,8,10,2};
		int largest = num[0];
		for(int i=0;i<num.length-1;i++) {
				if(num[i]>largest) {
					largest = num[i];
				}
		}
		System.out.println("Largest number is "+largest);
	}

}

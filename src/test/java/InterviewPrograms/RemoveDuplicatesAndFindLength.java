package InterviewPrograms;

public class RemoveDuplicatesAndFindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,2,2,3,3};
		
		int i =0;
		for(int j=1;j<arr.length-1;j++) {
			if(arr[j] != arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		int length = i+1;
		System.out.println("After removing duplicates new array length :"+length);
	}

}

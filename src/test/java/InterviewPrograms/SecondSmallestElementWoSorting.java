package InterviewPrograms;

public class SecondSmallestElementWoSorting {

	public static void main(String[] args) {
		int[] num = new int[] {5,1,2,8,10,2};
		int smallest = num[0];
		int sSmallest = Integer.MAX_VALUE;
		for(int i=1;i<num.length;i++) {
			if(num[i]< smallest) {
				sSmallest = smallest;
				smallest = num[i];
			}else if(num[i] != smallest && num[i] < sSmallest) {
				sSmallest = num[i];
			}
		}
		System.out.println("Second Smallest Element Wo Sorting is :"+sSmallest);
	}

}

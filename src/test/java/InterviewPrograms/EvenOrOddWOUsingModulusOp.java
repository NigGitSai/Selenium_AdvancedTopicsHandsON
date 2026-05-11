package InterviewPrograms;

public class EvenOrOddWOUsingModulusOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		
		while(num>1) {
			num = num-2;
		}
		if(num==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}

	}

}

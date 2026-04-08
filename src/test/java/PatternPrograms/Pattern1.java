package PatternPrograms;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern1(5);
	}
	
	public static void printPattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

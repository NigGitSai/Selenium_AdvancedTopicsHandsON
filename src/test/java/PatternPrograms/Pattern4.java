package PatternPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern5(5);
	}
	
	public static void printPattern5(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

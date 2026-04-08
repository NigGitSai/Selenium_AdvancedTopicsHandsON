package PatternPrograms;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(5);
	}
	
	public static void printPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

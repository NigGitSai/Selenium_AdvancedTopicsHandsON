package PatternPrograms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern3(5);

	}

	public static void printPattern3(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

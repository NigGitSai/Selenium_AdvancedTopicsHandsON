package PatternPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPatttern(5);
	}
	
	public static void printPatttern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

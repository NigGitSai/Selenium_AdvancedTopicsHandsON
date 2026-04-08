package PatternPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern6(5);
	}

	public static void printPattern6(int n) {
		for(int i=0;i<n;i++) {
			
			//space
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
				
		}
	}
}

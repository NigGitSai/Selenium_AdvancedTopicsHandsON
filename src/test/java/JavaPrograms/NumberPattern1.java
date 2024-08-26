package JavaPrograms;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=6;
		for(int i=5;i>=3;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)==6 || i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=4;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)==6 || i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}

package StringPrograms;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "000002056098";
		//String given = "08";
		//char[] charArr = given.toCharArray();
		String[] strArr = given.split("");
		int a, b,startIndexPos=0;
	
		outerLoop:
		for(int i=0;i<strArr.length;i++)
		{
			for(int j=i+1;j<strArr.length;j++)
			{
				a=  Integer.parseInt(strArr[i]);
				b =  Integer.parseInt(strArr[j]);
				if((a+b)==0)
				{
					continue outerLoop;
				}
				else if((a+b)>0)
					
				{
					startIndexPos=j;	
					break outerLoop;
				}
			}
		}
		
		System.out.println("Result without zeroes "+given.substring(startIndexPos));
	}

}

package StringPrograms;

public class RemoveLeadingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given= "0002325219209";
		int indexStartPos = 0;
		
		for(int i=0; i<given.length();i++)
		{
			if(!(given.charAt(i)=='0'))
			{
				indexStartPos = i;
				break;
			}
			
		}
		String r = given.substring(indexStartPos);
		System.out.println(r);
	}

}

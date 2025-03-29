package StringPrograms;

public class RemoveDuplicateUsingIndexOf {

	public static String removeDuplicates(String given)
	{
		String woDupl = "";
		
		
		for(int i=0; i<given.length();i++)
		{
			
			if(woDupl.indexOf(given.charAt(i))==-1)
			{
				woDupl=woDupl+given.charAt(i);
			}
	
		}
		return woDupl;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Remove Duplicates for string Apple :"+removeDuplicates("Apple"));
			
	}

}

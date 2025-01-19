package StringPrograms;

public class SortAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "software";
		
		char[] letters = given.toCharArray();
		
		char temp;
		for(int i=0;i<letters.length;i++)
		{
			for(int j=i+1;j<letters.length;j++)
			{
				if((int)letters[i]>(int)letters[j])
				{
					temp=letters[i];
					letters[i] = letters[j];
					letters[j] = temp;
				}
			}
		}
		String sorted="";
		for(Character ch:letters)
		{
			sorted=sorted+ch;
		}
		System.out.println("Sorted string "+sorted);
	}

}

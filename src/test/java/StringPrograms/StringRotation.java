package StringPrograms;

import java.util.ArrayList;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String given = "abcd";
		
		String rotation = given;
		String rotatedWord ="";
		ArrayList<String> lstWords = new ArrayList<String>();
		for(int i=0;i<given.length();i++)
		{
			rotation= rotation.substring(1)+rotation.charAt(0);
			lstWords.add(rotation);
		}
		System.out.println(lstWords);
	}

}

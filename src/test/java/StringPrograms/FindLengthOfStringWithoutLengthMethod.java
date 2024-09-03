package StringPrograms;

public class FindLengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String given = "Monday";
		 char[] ch = given.toCharArray();
		 int count = 0;
		 for(char temp:ch)
		 {
			 count = count+1;
			 
		 }
		 System.out.println("length of the string is "+count);
	}

}

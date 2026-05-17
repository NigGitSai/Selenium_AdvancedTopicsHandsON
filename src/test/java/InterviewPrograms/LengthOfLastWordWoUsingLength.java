package InterviewPrograms;

public class LengthOfLastWordWoUsingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "   Hello   World   ";
	   System.out.println("Length of the last word :"+lengthOfLastWord(given));
	}
	
	private static int lengthOfLastWord(String input) {
		int count = 0;
		String given = input.trim();
		
		char[] ipArr = given.toCharArray();
		
		for(int i = ipArr.length-1; i>=0;i--) {
			
			if(ipArr[i] != ' ') {
				count = count+1;		
			}
			else {
				if(count >0) {
					
					return count;
				}
			}
		}
		
		return count;
	}

}

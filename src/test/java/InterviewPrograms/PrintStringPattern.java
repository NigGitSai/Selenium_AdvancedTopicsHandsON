package InterviewPrograms;

public class PrintStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "2a3b4c";
		System.out.println("Result is :"+printPattern(given));
	}

	private static String printPattern(String s) {
		if(s.isBlank() || s.isEmpty() || s.equals(null)) {
			System.out.println("Not a valid String input");
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i=i+2) {
		 int count =	Character.getNumericValue(s.charAt(i));
		 char alphabet = s.charAt(i+1);
		 sb.append(String.valueOf(alphabet).repeat(count));
		}

		return sb.toString();

	}

}

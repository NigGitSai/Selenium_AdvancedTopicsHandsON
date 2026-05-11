package InterviewPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "R@56vi Ku$mar67";
		
		int sum=0;
		StringBuilder sb = new StringBuilder();
		
		char[] letters = s.toCharArray();
		
		for(char ch: letters) {
			if(Character.isLetter(ch) || ch==' ') {
				sb.append(ch);
			}
			else if(Character.isDigit(ch)) {
				sum = sum+Character.getNumericValue(ch);
				
			}
		}
		sb.append(sum);
		System.out.println("Result value :"+sb);
	}

}

package InterviewPrograms;

public class ValidPalindromeUsing2Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "$Madam$";
		System.out.println("Is "+input+" a palindrome ?"+isPalindrome(input));
	}

	
	public static boolean isPalindrome(String input) {
		if(input.isEmpty() || input.isBlank() || input.equals(null)) {
			System.out.println("It is not a valid input");
			return false;
		}
		
		char[] x = input.toCharArray();
		int left =0;
		int right = x.length-1;
		
		while(left<right) {
			while(!Character.isLetterOrDigit(x[left])){
				left++;
			}
			
			while(!Character.isLetterOrDigit(x[right])) {
				right--;
			}
			
			if(Character.toLowerCase(x[left]) != Character.toLowerCase(x[right])) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
}

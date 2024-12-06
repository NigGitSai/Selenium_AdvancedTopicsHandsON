package StringPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping a is "+a);
		System.out.println("Before swapping b  is "+b);
		
		a = a+b;
		
		b= a.substring(0,a.length()-b.length());
		
		a= a.substring(b.length());
		
		System.out.println("After swapping a is "+a);
		System.out.println("After swapping b is "+b);
		
	}

}

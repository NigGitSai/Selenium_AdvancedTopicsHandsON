package StringPrograms;

import org.testng.annotations.Test;

public class SwapTwoNumbers {

	@Test(enabled = false)
	public void method1()
	{
		// TODO Auto-generated method stub
		int a = 5;
		int b  =6;
		System.out.println("before swapping");
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping");
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+b);
	}
	
	@Test
	public void method2()
	{
		int a = 5;
		int b  =6;
		System.out.println("before swapping");
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+b);
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("After swapping");
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+b);
	}
	

}

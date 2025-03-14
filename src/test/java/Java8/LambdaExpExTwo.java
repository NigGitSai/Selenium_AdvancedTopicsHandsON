package Java8;

public class LambdaExpExTwo {

	public void usingClassicalWay()
	{
		IExampleTwoFuncInterface iExampleTwoFuncInterface = new ClassBImpExampleTwo();
		
		
		System.out.println("using classical way : "+iExampleTwoFuncInterface.sum(2, 3));
	}
	
	public void usingAnonymousInnerClass()
	{
		IExampleTwoFuncInterface iExampleTwoFuncInterface = new ClassBImpExampleTwo() {
			
			@Override
			public int sum(int a, int b)
			{
				return a+b;
			}
		};
		
		System.out.println("using anonymous inner class : "+iExampleTwoFuncInterface.sum(4, 10));
	}
	
	public void usingLambdaExpWReturn()
	{
		IExampleTwoFuncInterface iExampleTwoFuncInterface = (a,b)->{return a+b;};
		
		System.out.println("using lambda expression  with return statement: "+iExampleTwoFuncInterface.sum(6, 13));
	}
	
	public void usingLambdaExpWOReturn()
	{
		IExampleTwoFuncInterface sum2 = (val1, val2)-> val1+val2;
		
		System.out.println("using lambda expression  without return : "+sum2.sum(6, 13));
	}
	
	
	public static void main(String[] args) {
		
		LambdaExpExTwo lambdaExpExTwo = new LambdaExpExTwo();
		
		lambdaExpExTwo.usingClassicalWay();
		
		lambdaExpExTwo.usingAnonymousInnerClass();
		
		lambdaExpExTwo.usingLambdaExpWReturn();
		
		lambdaExpExTwo.usingLambdaExpWOReturn();
	}
}

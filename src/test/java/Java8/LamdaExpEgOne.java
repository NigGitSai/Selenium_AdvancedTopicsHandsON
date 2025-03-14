package Java8;

public class LamdaExpEgOne  {
	
	public static void usingClassicalWay()
	{
		IExampleOneFuncInterface iExampleOneFuncInterface = new ClassAImpExampleOne();
		
		iExampleOneFuncInterface.sayHi();
		
	}
	
	public static void usingAnnonymousInnerClass() {
		
		IExampleOneFuncInterface iExampleOneFuncInterface = new ClassAImpExampleOne() {
			
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("Hi from Calss A implementing functional interface - From anonymous inner class");
			}
		};
		iExampleOneFuncInterface.sayHi();
	}
	
	public static void usingLamdaExp()
	{
		IExampleOneFuncInterface iExampleOneFuncInterface = ()->System.out.println("Hi from Calss A implementing functional interface - from lamda expression");
		iExampleOneFuncInterface.sayHi();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingClassicalWay();
		
		usingAnnonymousInnerClass();
		
		usingLamdaExp();
		
	}

}

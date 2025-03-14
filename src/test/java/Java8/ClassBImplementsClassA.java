package Java8;

import java.lang.constant.ClassDesc;

public class ClassBImplementsClassA  extends StaticMethodInClassA{

	
	public static void main(String[] args) 
	{
		ClassBImplementsClassA.methodA();
		ClassBImplementsClassA classBImplementsClassA = new ClassBImplementsClassA();
		classBImplementsClassA.methodA();
		StaticMethodInClassA.methodA();
	}
}

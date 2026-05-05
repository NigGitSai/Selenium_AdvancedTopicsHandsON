package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		Calculator cal = new Calculator();
		int result = cal.add(10, 19);
		
		System.out.println("Result of add "+result);
		
		Class<Calculator> clazz = Calculator.class;
		Field x = clazz.getDeclaredField("x");
		x.setAccessible(true);
		
	
		int xVal = x.getInt(cal);
		System.out.println("X value :"+xVal);
		
		x.setInt(cal, 20);
		xVal = x.getInt(cal);
		
		System.out.println("X value:"+xVal);
		
		Method addMethod = clazz.getMethod("add", int.class,int.class);
		
		int addMethodRes =(int) addMethod.invoke(cal, 10,40);
		
		System.out.println("Add Method Result using reflection :"+addMethodRes);
	}

}

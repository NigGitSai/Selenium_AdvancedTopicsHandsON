package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeStaticMethodFields {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class<Calculator> clazz = Calculator.class;
		Field y =clazz.getDeclaredField("y");
		y.setAccessible(true);

		int yVal = y.getInt(null);
		System.out.println("Y value :"+yVal);
		
		
		Method demoMethod = clazz.getDeclaredMethod("demo");
		demoMethod.setAccessible(true);

		demoMethod.invoke(null);
	}

}

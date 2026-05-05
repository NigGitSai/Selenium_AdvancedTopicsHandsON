package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiffWaysToCreateClassObj {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		//First Method

		Calculator cal = new Calculator();

		// Second method

		Class<Calculator> clazz = Calculator.class;

		//third method

		Class<?> clazz1 =	cal.getClass();
		
		//fourth method // throws ClassNotFoundException
		
		Class<?> clazz2  = Class.forName("");
		
		
		//fifth method deprecated from java 9
		
		Class<Calculator> clazz4 = Calculator.class;
		Calculator cal2 = (Calculator) clazz4.newInstance();
		
		//Recommended way
		Constructor<?> constructor = clazz4.getDeclaredConstructor();
		Calculator cal3 = (Calculator) constructor.newInstance();
		
		
		
		
		
	}

}

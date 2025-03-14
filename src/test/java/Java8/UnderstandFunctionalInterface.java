package Java8;

@FunctionalInterface
public interface UnderstandFunctionalInterface {
	
	void example();
	
	int hashCode();
	
	boolean equals(Object obj);
	
	default int sum(int a, int b)
	{
		return a+b;
	}

}

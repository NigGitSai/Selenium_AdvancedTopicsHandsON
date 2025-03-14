package DefaultMethodAndMultipleInheritance;

public interface IMother {

	default void eat()
	{
		System.out.println("Eat apple");
	}
}

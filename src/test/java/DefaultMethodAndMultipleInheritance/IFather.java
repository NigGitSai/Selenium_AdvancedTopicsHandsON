package DefaultMethodAndMultipleInheritance;

public interface IFather {
	
	default void eat()
	{
		System.out.println("Eat Mango");
	}
}

package Java8;

@FunctionalInterface
public interface IChildEx2 extends IParentEx1 {

	default String print()
	{
		return "hello";
	}
}

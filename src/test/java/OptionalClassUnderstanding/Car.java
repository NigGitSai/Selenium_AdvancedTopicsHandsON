package OptionalClassUnderstanding;

public class Car {

	private String name;
	
	private Insurance insurance;
	
	public Car(String name, Insurance insurance)
	{
		this.name = name;
		this.insurance = insurance;
	}

	public String getName() {
		return name;
	}

	public Insurance getInsurance() {
		return insurance;
	}
	
}

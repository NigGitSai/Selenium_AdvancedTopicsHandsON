package OptionalClassUnderstanding;

import java.util.Optional;

public class PersonUsingOptional {
	
	private String name;
	private Optional<CarOptional> car;
	
	public PersonUsingOptional(String name, CarOptional car)
	{
		super();
		this.name = name;
		this.car = Optional.ofNullable(car);
	}

	public String getName() {
		return name;
	}

	public Optional<CarOptional> getCar() {
		return car;
	}
	
	public String getCarInsuranceName(Person person)
	{
		return person.getCar().getInsurance().getName();
		 
	}
	
	public String getCarInsuranceUsingOptional(PersonUsingOptional person)
	{
       Optional<PersonUsingOptional> personOptional =		Optional.ofNullable(person);
       
      return personOptional
       .flatMap(PersonUsingOptional::getCar)
       .flatMap(CarOptional::getInsurance)
       .map(Insurance::getName)
       .orElse("One of the value is null");
       
       
		
	}

}

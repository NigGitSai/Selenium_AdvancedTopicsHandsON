package OptionalClassUnderstanding;

public class PersonRunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("John",new Car("Audi", new Insurance("testy")));
		
		System.out.println(person.getCarInsuranceName(person));
		
		Person person2 = new Person("Daria", null);
		
		System.out.println(person2.getCarInsuranceName(person2));

	}

}

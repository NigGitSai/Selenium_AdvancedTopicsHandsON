package StreamAPI_Intro_ProblemStatement;

public class Employee {
	
	String name;
	double Salary;
	public String getName() {
		return name;
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public double getSalary() {
		return Salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}
	

}

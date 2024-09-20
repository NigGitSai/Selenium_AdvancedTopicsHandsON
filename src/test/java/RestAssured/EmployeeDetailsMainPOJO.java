package RestAssured;

public class EmployeeDetailsMainPOJO {
	
	private EmploymentDetailsEmployerPOJO employmentDetails;
	
	private SalaryPOJO salary;

	public EmploymentDetailsEmployerPOJO getEmploymentDetails() {
		return employmentDetails;
	}

	public void setEmploymentDetails(EmploymentDetailsEmployerPOJO employmentDetails) {
		this.employmentDetails = employmentDetails;
	}

	public SalaryPOJO getSalary() {
		return salary;
	}

	public void setSalary(SalaryPOJO salary) {
		this.salary = salary;
	}
	

}

package RestAssured;

import java.util.List;

public class EmployeeMainPOJO {

	private String id;
	private String name;
	private String email;
	private AddressPOJO address;
	
	private List<PhoneNumberPOJO> phoneNumber;
	
	private EmployeeDetailsMainPOJO employeeDetails;
	
	private List<DependentsPOJO> dependents;

	private List<SkillsPOJO> skills;
	
	private List<String> hobbies;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AddressPOJO getAddress() {
		return address;
	}

	public void setAddress(AddressPOJO address) {
		this.address = address;
	}

	public List<PhoneNumberPOJO> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumberPOJO> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeDetailsMainPOJO getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetailsMainPOJO(EmployeeDetailsMainPOJO employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public List<DependentsPOJO> getDependents() {
		return dependents;
	}

	public void setDependentsPOJO(List<DependentsPOJO> dependents) {
		this.dependents = dependents;
	}

	public List<SkillsPOJO> getSkills() {
		return skills;
	}

	public void setSkillsPOJO(List<SkillsPOJO> skills) {
		this.skills = skills;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	
	
}

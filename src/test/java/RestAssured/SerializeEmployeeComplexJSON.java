package RestAssured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeEmployeeComplexJSON {
	
	@Test
	public void constructEmployeeComplexJSOn() throws JsonProcessingException
	{
		
		CoordinatesPOJO coordinates = new CoordinatesPOJO();
		
		coordinates.setLatitude(32.141425);
		coordinates.setLongitude(-89.6501);
		
		AddressPOJO addressPOJO = new AddressPOJO();
		addressPOJO.setStreet("123 Elm St");
		addressPOJO.setCity("Springfield");
		addressPOJO.setState("IL");
		addressPOJO.setZipcode("62704");
		
		addressPOJO.setCoordinates(coordinates);
		
		
		EmployeeMainPOJO employeeMainPOJO = new EmployeeMainPOJO();
		
		
		PhoneNumberPOJO phoneNumber1 = new PhoneNumberPOJO();
		
		phoneNumber1.setType("home");
		
		phoneNumber1.setNumber("555-555-1234");
		
		PhoneNumberPOJO phoneNumber2 = new PhoneNumberPOJO();
		
		phoneNumber2.setType("work");
		
		phoneNumber2.setNumber("555-555-5678");
		
		List<PhoneNumberPOJO> phoneNumbers = new ArrayList<PhoneNumberPOJO>();	
		phoneNumbers.add(phoneNumber1);
		phoneNumbers.add(phoneNumber2);
		
		BonusPOJO bonus = new BonusPOJO();
		
		bonus.setType("performance");
		bonus.setAmount(500000);
		
		SalaryPOJO salary = new SalaryPOJO();
		salary.setCurrency("USD");
		
		salary.setBase(75000);
		
		salary.setBonus(bonus);
		
		EmploymentDetailsAddressPOJO address = new EmploymentDetailsAddressPOJO();
		address.setStreet("456 Oak St");
		
		address.setCity("Metropolis");
		
		address.setState("NY");
		
		address.setZipcode("10001");
		
		EmploymentDetailsEmployerPOJO employer = new EmploymentDetailsEmployerPOJO();
		
		employer.setCompanyName("TechCorp");
		
		employer.setPosition("Software Engineer");
		
		employer.setStartDate("2015-06-01");
		
		employer.setEndDate("2019-06-01");
		
		employer.setAddress(address);
		
		
		EmployeeDetailsMainPOJO employeeDetailsMainPOJO  = new  EmployeeDetailsMainPOJO();
		
		
		employeeDetailsMainPOJO.setEmploymentDetails(employer);
		
		employeeDetailsMainPOJO.setSalary(salary);
		
		DependentsPOJO dependents1 = new DependentsPOJO();
		
		dependents1.setName("Jane Doe");
		dependents1.setAge(8);
		dependents1.setRelationship("daughter");
		
		DependentsPOJO dependents2 = new DependentsPOJO();
		
		dependents2.setName("Sam Doe");
		dependents2.setAge(5);
		dependents2.setRelationship("son");
		
		List<DependentsPOJO> dependents = new ArrayList<DependentsPOJO>();
		dependents.add(dependents1);
		dependents.add(dependents2);
		
		
		SkillsPOJO skills1 = new SkillsPOJO();
		
		skills1.setName("Java");
		skills1.setExperience("5");
		
		SkillsPOJO skills2 = new SkillsPOJO();
		
		skills2.setName("Selenium");
		skills2.setExperience("3");
		
		List<SkillsPOJO> skills = new ArrayList<SkillsPOJO>();
		skills.add(skills1);
		skills.add(skills2);
		
		employeeMainPOJO.setId("105");
		employeeMainPOJO.setName("John Doe");
		
		employeeMainPOJO.setEmail("john.doe@example.com");
		
		employeeMainPOJO.setAddress(addressPOJO);
		
		employeeMainPOJO.setPhoneNumber(phoneNumbers);
		
		employeeMainPOJO.setEmployeeDetailsMainPOJO(employeeDetailsMainPOJO);
		
		employeeMainPOJO.setDependentsPOJO(dependents);
		
		employeeMainPOJO.setSkillsPOJO(skills);
		employeeMainPOJO.setHobbies(Arrays.asList("reading","gaming"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		String employeeMainJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeMainPOJO);
		
		System.out.println(employeeMainJSON);
	}

}

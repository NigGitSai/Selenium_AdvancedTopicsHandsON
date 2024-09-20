package RestAssured;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConstructEmploymentDetailsJSON {
	
	/*
	 * "employmentDetails": {
    "employer": {
      "companyName": "TechCorp",
      "position": "Software Engineer",
      "startDate": "2015-06-01",
      "endDate": null,
      "address": {
        "street": "456 Oak St",
        "city": "Metropolis",
        "state": "NY",
        "zipcode": "10001"
      }
    },
    "salary": {
      "currency": "USD",
      "base": 75000,
      "bonus": {
        "type": "performance",
        "amount": 5000
      }
    }
  },
	 */
	
	@Test
	public void constructEmpDetailsJSON() throws JsonProcessingException
	{
			BonusPOJO bonusPOJO = new BonusPOJO();
			
			bonusPOJO.setType("performance");
			bonusPOJO.setAmount(500000);
			
			SalaryPOJO salaryPOJO = new SalaryPOJO();
			salaryPOJO.setCurrency("USD");
			
			salaryPOJO.setBase(75000);
			
			salaryPOJO.setBonus(bonusPOJO);
			
			EmploymentDetailsAddressPOJO employmentDetailsAddressPOJO = new EmploymentDetailsAddressPOJO();
			employmentDetailsAddressPOJO.setStreet("456 Oak St");
			
			employmentDetailsAddressPOJO.setCity("Metropolis");
			
			employmentDetailsAddressPOJO.setState("NY");
			
			employmentDetailsAddressPOJO.setZipcode("10001");
			
			EmploymentDetailsEmployerPOJO employmentDetailsEmployerPOJO = new EmploymentDetailsEmployerPOJO();
			
			employmentDetailsEmployerPOJO.setCompanyName("TechCorp");
			
			employmentDetailsEmployerPOJO.setPosition("Software Engineer");
			
			employmentDetailsEmployerPOJO.setStartDate("2015-06-01");
			
			employmentDetailsEmployerPOJO.setEndDate("2019-06-01");
			
			employmentDetailsEmployerPOJO.setAddress(employmentDetailsAddressPOJO);
			
			
			EmployeeDetailsMainPOJO employeeDetailsMainPOJO  = new  EmployeeDetailsMainPOJO();
			
			
			employeeDetailsMainPOJO.setEmploymentDetails(employmentDetailsEmployerPOJO);
			
			employeeDetailsMainPOJO.setSalary(salaryPOJO);
			
			ObjectMapper mapper = new ObjectMapper();
			
			String employeeDetailsJSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeDetailsMainPOJO);
			
			System.out.println(employeeDetailsJSON);
	}
}

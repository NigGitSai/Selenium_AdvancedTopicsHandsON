package RestAssured;

public class EmploymentDetailsEmployerPOJO {
	
	private String companyName;
	private String position;
	private String startDate;
	private String endDate;
	
	private EmploymentDetailsAddressPOJO address;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public EmploymentDetailsAddressPOJO getAddress() {
		return address;
	}

	public void setAddress(EmploymentDetailsAddressPOJO address) {
		this.address = address;
	}
	
	
}

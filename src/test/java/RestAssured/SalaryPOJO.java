package RestAssured;

public class SalaryPOJO {
	
	private String currency;
	private int base;
	private BonusPOJO bonus;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public BonusPOJO getBonus() {
		return bonus;
	}
	public void setBonus(BonusPOJO bonus) {
		this.bonus = bonus;
	}
	

}

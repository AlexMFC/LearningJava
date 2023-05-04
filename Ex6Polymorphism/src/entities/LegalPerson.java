package entities;

public class LegalPerson extends Person{
	private Integer numberOfEmployees;
	
	
	
	
	public LegalPerson() {
		super();
		
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.setNumberOfEmployees(numberOfEmployees);
	}
	
	public LegalPerson(String name, Double annualIncome) {
		super(name, annualIncome);
		this.setNumberOfEmployees(0);
	}
	
	@Override
	public Double taxes() {
		Double taxes;
		if (this.getNumberOfEmployees() > 10) {
			taxes = this.getAnnualIncome()*0.14;
		} else {
			taxes = this.getAnnualIncome()*0.16;
		}
		return taxes;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
}

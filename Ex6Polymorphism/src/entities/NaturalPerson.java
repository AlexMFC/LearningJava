package entities;

public class NaturalPerson extends Person {
	private Double healthExpenses;

	public NaturalPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NaturalPerson(String name, Double annualIncome) {
		super(name, annualIncome);
		this.setHealthExpenses(0.0);
	}
	
	public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.setHealthExpenses(healthExpenses);		
	}
	
	
	@Override
	public Double taxes() {
		Double taxes = 0.0;
		if (this.getAnnualIncome()>0) {
			if (this.getAnnualIncome() < 20000) {
				taxes = this.getAnnualIncome()*0.15;
			} else {
				taxes = this.getAnnualIncome()*0.25;
			}
			if (this.getHealthExpenses() > 0) {
				taxes -= this.getHealthExpenses()*0.5;
			}
		} else {
			taxes = 0.0;
		}
		
		return taxes;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	
	
}

package entities;

public abstract class Person {
	private String name;
	private Double annualIncome;
	
	public Person() {
		
	}

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}
	
	public abstract Double taxes();

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.getName());
		string.append("   $" + String.format("%2f", this.taxes()));
		
		
		return string.toString();
	}
	
	
	
	
	
}

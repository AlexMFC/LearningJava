package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.setAdditionalCharge(additionalCharge);
	}

	
	private Double getAdditionalCharge() {
		return additionalCharge;
	}

	private void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment()+(getAdditionalCharge()*1.1);	
	}
	
	/*public String toString() {
		return super.toString();
	}*/
	

}

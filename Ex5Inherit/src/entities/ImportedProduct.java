package entities;

public class ImportedProduct extends Product{
	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.setCustomFee(customFee); 
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " $" + this.totalPrice() + " (Customs fee: $" + this.getCustomFee() +")";
	}
	
	public Double totalPrice() {
		return this.getPrice()+this.getCustomFee();
	}
	public Double getCustomFee() {
		return customFee;
	}

	private void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	
	
}	

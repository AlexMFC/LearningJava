package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		return this.getName() + " $" + this.getPrice();
	}
	
	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
}
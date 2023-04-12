package entities;

public class Products {
	private double value;
	private String name;
	private int quantity;
	
	
	
	public Products(double value, String name, int quantity) {
		this.setValue(value);
		this.setName(name);
		this.setQuantity(quantity);
	}
	
	public Products(int value, String name) {
		this.setValue(value);
		this.setName(name);
		this.setQuantity(0);
	}
	
	
	public double getValue() {
		return value;
	}
	private void setValue(double value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Products [value=" + value + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	
	
}

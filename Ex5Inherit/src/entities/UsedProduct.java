package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedProduct(String name, Double price, Date manufactureDate) throws ParseException {
		super(name, price);
		this.setManufactureDate(manufactureDate);
	}

	@Override
	public String priceTag() {
		return this.getName() + "(used) $" + this.getPrice() + "(Manufacture date: " + fmt1.format(this.getManufactureDate())+ ")";
	}
	
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
}

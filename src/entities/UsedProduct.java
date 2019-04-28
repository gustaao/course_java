package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufacture;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}

	public Date getManufacture() {
		return manufacture;
	}

	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}

	@Override
	public String priceTag() {
		return getName() + String.format("(used) $ %s %.2f (Manufacture date %s )", getPrice(), manufacture ); 
		
	}
	
	
}

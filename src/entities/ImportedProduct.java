package entities;

public class ImportedProduct extends Product {

	private double CustomsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		CustomsFee = customsFee;
	}

	public double getCustomsFee() {
		return CustomsFee;
	}

	public void setCustomsFee(double customsFee) {
		CustomsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return getName() + " $ " + getPrice() + getCustomsFee();
	}	
	
	
}

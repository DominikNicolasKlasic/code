package model;

public class Product {
	private int barcode;
	private String productName;
	private String description;
	protected double salesPrice;
	
	public int getBarcode() {
		return barcode;
	}
	
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getSalesPrice() {
		return salesPrice;
	}
	
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	public Product(int barcode, String productName, String descprition, double salesPrice) {
		this.setBarcode(barcode);
		this.setProductName(productName);
		this.setDescription(descprition);
		this.setSalesPrice(salesPrice);
	}
}

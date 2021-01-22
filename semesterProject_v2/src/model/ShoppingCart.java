package model;

public class ShoppingCart {
	private Product p;
	private int amountOfItems;
	private double price;
	private boolean discountPrice;
	
	public ShoppingCart() {
		amountOfItems = 0;
		discountPrice = false;
	}
	
	public void addProduct(Product p) {
		amountOfItems++;
		System.out.println("Product: " + p.getProductName() + " has been added to the shopping cart.");
	}
	
	public void removeProduct(Product p) {
        amountOfItems--;
        System.out.println("Product: " + p.getProductName() + " has been removed.");
    }
	
	public Product getProduct() {
		return p;
	}
	
	public int getAmountOfItems() {
		return amountOfItems;
	}
	
	public double getCartPrice() {
		if(!discountPrice) {
			price = p.getSalesPrice();
			return price * amountOfItems;
		} else {
			return price * amountOfItems;
		}	
	}
	
	public void setDiscountPrice(double d) {
		discountPrice = true;
		price = (((100-d)/100)*p.getSalesPrice());
	}
}

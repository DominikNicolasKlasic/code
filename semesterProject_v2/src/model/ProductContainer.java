package model;

import java.util.ArrayList;

public class ProductContainer {
	private ArrayList<Product> items;
	private static ProductContainer productContainer;
	private int i;
	
	public ProductContainer() {
		items = new ArrayList<>();
	}
	
	public static synchronized ProductContainer getProductContainer() {
        if(productContainer == null) {
            productContainer = new ProductContainer();
        }
        return productContainer;
    }
	
	public void addProduct(Product p) {
		if(items.contains(p)) {
			System.out.println("The product: " + "'" + p.getProductName() + "'" + "is already in the list.");
		} else {
			items.add(p);
			System.out.println("The product: " + "'" + p.getProductName() + "'" + " has been added to the list.");
		}
	}
	
	public void findProductByBarcode(int barcode) {
		int match = 0;
		
		for(Product p : items) {
			if(barcode == p.getBarcode()) {
				System.out.println("Product name: " + p.getProductName());
				System.out.println("Product barcode: " + p.getBarcode());
				System.out.println("Product description: " + p.getDescription());
				System.out.println("Product price: " + p.getSalesPrice());
				match = 1;
				i++;
			} else if(match == 0) {
				System.out.println("Something went wrong..");
			}
			}
		}
	
	public void removeProduct(int barcode) {
		int match = 0;
		
		for(Product p : items) {
			if(barcode == p.getBarcode()) {
				items.remove(p);
				match = 1;
				i++;
				System.out.println("The product: " + "'" + p.getProductName() + "'" + "has been removed.");
			} else if(match == 0) {
				System.out.println("Something went wrong.");
			}
		}
	}
}


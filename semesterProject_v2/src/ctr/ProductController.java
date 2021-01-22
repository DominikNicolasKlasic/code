package ctr;

import model.Product;
import model.ProductContainer;

public class ProductController {
	
	private ProductContainer productContainer;
	
	public ProductController() {
		productContainer = new ProductContainer();
		ProductContainer.getProductContainer();
	}
	
	public void createProduct(int barcode, String productName, String description, double salesPrice) {
		Product p = new Product(barcode, productName, description, salesPrice);
		productContainer.addProduct(p);
	}
	public void findProductInfo(int barcode) {
		productContainer.findProductByBarcode(barcode);
	}
	public void removeProduct(int barcode) {
		productContainer.removeProduct(barcode);
	}
}

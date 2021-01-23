package model;

import java.util.ArrayList;

public class Sale {
	private ArrayList<ShoppingCart> cart;
	private int orderId;
	private double price;
	private int workerId;
	private boolean active;

	
	public Sale(int orderId, int workerId) {
		cart = new ArrayList<>();
		this.setOrderId(orderId);
		this.setWorkerId(workerId);
		this.price = 0;
		active = true;
	}
	
	public void addItem(int barcode) {
		boolean alreadyExists = false;
		int i = 0;
		if(isActive()) {
			if(alreadyExists) {
				cart.get(i).getAmountOfItems();
				System.out.println("The shopping cart already exists. And consists of " + cart.get(i).getAmountOfItems() + " items.");
			} else {
				ShoppingCart sc = new ShoppingCart();
				cart.add(sc);
				System.out.println("The shopping cart didn't exist, new shopping cart has been created.");
			}
		} else {
			System.out.println("Something went wrong.");
		}
	}
	
	public void addItemWithDiscount(int barcode, double discount) {
		boolean alreadyExists = false;
		int i = 0;
		if(isActive()) {
			if(alreadyExists) {
				cart.get(i).getAmountOfItems();
				cart.get(i).setDiscountPrice(discount);
				System.out.println("The shopping cart already exists.");
			} else {
				ShoppingCart sc = new ShoppingCart();
				cart.add(sc);
				sc.setDiscountPrice(discount);
				System.out.println("The shopping cart has been created and the discount applied.");
				
			}
		} else {
			System.out.println("Something went wrong...");
		}
	}
	
	public double getTotalPrice() {
        double  tp = 0;
        if(cart.size() != 0) {
            for(ShoppingCart sc : cart) {
                return tp += sc.getCartPrice();
            }
        }
        price = tp;
        return price;
    }
	
	public int getSize() {
		int i = 0;
		return cart.get(i).getAmountOfItems();
	}
	
	public void endSale() {
        active = false;
    }
	
	public boolean isActive() {
	    return active;
	}
	 
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	
	public int getWorkerId() {
		return workerId;
	}
}

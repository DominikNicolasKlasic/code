package model;

import java.util.ArrayList;

public class SaleContainer {
	private ArrayList<Sale> sales;
    private static SaleContainer saleContainer;
    private int i;
    
    public SaleContainer() {
        sales = new ArrayList<Sale>();
    }
    
    public static synchronized SaleContainer getSaleContainer() {
        if(saleContainer == null) {
            saleContainer = new SaleContainer();
        }
        return saleContainer;
    }
    
    public void createNewSale(int orderId, int workerId) {
        int i = sales.size();
        Sale s = new Sale(i, workerId);
        sales.add(s);
        System.out.println("The sale: " + s + " has been created.");
    }
    
    public void addItem() {
    }
    
    public void findSaleByOrderId(int orderId) {
    	int match = 0;

        for(Sale s : sales) {
            if (orderId == s.getOrderId()) {
            	System.out.println("***********************");
				System.out.println("Sale order ID: " + s.getOrderId());
				System.out.println("Sale worker ID: " + s.getWorkerId());
				System.out.println("Sale size: " + s.getSize());
				System.out.println("Sale price: " + s.getTotalPrice());
				System.out.println("***********************");
                match = 1;
                i++;

            }
        }
        if (match == 0) {
            System.out.println("Something went wrong..");
        }
    }
    
    public void endSalebyOrderId(int orderId) {
    	int match = 0;

        for(Sale s : sales) {
            if (orderId == s.getOrderId()) {
                sales.remove(s);
            	System.out.println("The sale with the order ID: " + "'" + s.getOrderId() + "'" + " has ended.");
                match = 1;
                i++;

            }
        }
        if (match == 0) {
            System.out.println("Something went wrong..");
        }
    }
    
    public int getSize() {
        return sales.size();
    }
    
    public void addSale(Sale s) {
        sales.add(s);
    }
}

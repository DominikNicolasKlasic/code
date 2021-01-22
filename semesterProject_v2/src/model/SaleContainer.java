package model;

import java.util.ArrayList;

public class SaleContainer {
	private ArrayList<Sale> sales;
    private static SaleContainer saleContainer;
    
    public SaleContainer() {
        sales = new ArrayList<Sale>();
    }
    
    public static synchronized SaleContainer getSaleContainer() {
        if(saleContainer == null) {
            saleContainer = new SaleContainer();
        }
        return saleContainer;
    }
    
    public void createNewSale(int workerId) {
        int i = sales.size();
        Sale s = new Sale(i, workerId);
        sales.add(s);
        System.out.println("The sale: " + s + " has been created.");
    }
    
    public int getSize() {
        return sales.size();
    }
    
    public void addSale(Sale s) {
        sales.add(s);
    }
}

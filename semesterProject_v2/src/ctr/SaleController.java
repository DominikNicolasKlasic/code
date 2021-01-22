package ctr;

import model.*;

public class SaleController {
	private SaleContainer saleContainer;
    private Sale currentSale, s;
    private Person p;

    public SaleController() {
        saleContainer = SaleContainer.getSaleContainer();

    }

    public void createNewSale(int orderId,int workerId) {
        if(p instanceof Worker) {
            Worker w = (Worker)p;
            saleContainer.createNewSale(orderId, w.getId());
            currentSale = s;
            System.out.println("The sale was created");
        }

    }
    
    public void addItem(Product p) {
    	currentSale.addItem(p);
    }

    public void addItemWithDiscount(Product p, double discount) {
        currentSale.addItemWithDiscount(p, discount);
    }

    public void printTotalPrice() {
    	currentSale.getTotalPrice();
    }

    public boolean isActive() {
        if(currentSale != null) {
            return currentSale.isActive();
        }
        else {
            return false;
        }
    }

    public void enddSale() {
        currentSale.endSale();
    }
}

package ctr;

import model.*;

public class SaleController {
	private SaleContainer saleContainer;
    private Sale sale;
    private Sale currentSale;
    private Person p;

    public SaleController() {
        saleContainer = SaleContainer.getSaleContainer();

    }

    public void createNewSale(int workerId) {
        if(p instanceof Worker) {
            Worker w = (Worker)p;
            saleContainer.createNewSale(w.getId());
            currentSale = sale;
            System.out.println("The sale was created");
        }

    }
    
    public void addItem(String barcode) {
       
    }

    public void addItemWithDiscount(String barcode, double discount) {
        
    }

    public void printTotal() {

    }

    public void printCurrentOrderId() {

    }

    public boolean isActive() {
        if(currentSale != null) {
            return currentSale.isActive();
        }
        else {
            return false;
        }
    }

    public void closeSale() {
        currentSale.endSale();
    }
}

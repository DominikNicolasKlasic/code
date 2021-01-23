package ui;

import java.util.Scanner;

import ctr.PersonController;
import ctr.ProductController;
import ctr.SaleController;

public class ManagementMenu {
	 private PersonController personController;
	 private ProductController productController;
	 private SaleController saleController;
	 private Scanner sc;
	    
	 public ManagementMenu() {
         personController = new PersonController();
	     productController = new ProductController();
	     saleController = new SaleController();
	     sc = new Scanner(System.in);
	 }
	 
	 public void start() {
		 theMenu();
	 }
	 
	 private void theMenu() {
	        boolean running = true;
	        while (running) {
	            int choice = writeTheMenu();
	            switch (choice) {
	            case 1:
	            	int orderId = 0;
	            	int workerId = 0;
	            	int barcode = 0;
	            	double discount = 0.0;
	            	
	            	
	            	System.out.println("Order ID: ");
                    orderId = sc.nextInt();
                    
                    System.out.println("Worker ID: ");
                    workerId = sc.nextInt();
	            	
	            	System.out.println("New sale has been created");
	            	saleController.createNewSale(orderId, workerId);
	            	break;
	            case 2:
	            	
	            	System.out.println("Add item to the sale via barcode");
	            	barcode = sc.nextInt();
	            	saleController.addItem(barcode);
	            	break;
	            	
	            case 3:
	            	
	            	System.out.println("Add an item to the sale via barcode.");
	            	barcode = sc.nextInt();
	            	System.out.println("Add a discount to the item.");
	            	discount = sc.nextDouble();
	            	saleController.addItemWithDiscount(barcode, discount);
	            	break;
	            	
	            case 4:
	            	
	            	System.out.println("Find sale via order ID: ");
	            	orderId = sc.nextInt();
	            	saleController.findSaleInfo(orderId);
	            	break;
	            	
	            case 5:
	            	
	            	System.out.println("End sale via order ID: ");
	            	orderId = sc.nextInt();
	            	saleController.endSale();
	            }
	        }
	    }
	 
	 private int writeTheMenu() {
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("****** Management menu ******");
	        System.out.println(" (1) Create Sale");
	        System.out.println(" (2) Add Item to Sale");
	        System.out.println(" (3) Add Item with discount to Sale");
	        System.out.println(" (4) Find Sale");
	        System.out.println(" (5) End Sale");
	        System.out.print("\n Choose:");
	        int choice = getIntegerFromUser(keyboard);
	        return choice;
	    }

	    public void init(SaleController saleController) {
	        this.saleController = saleController;
	    }
	    
	    private int getIntegerFromUser(Scanner keyboard) {
	        while (!keyboard.hasNextInt()) {
	            System.out.println("Input must be a number - try again");
	            keyboard.nextLine();
	        }
	        return keyboard.nextInt();
	    }
}

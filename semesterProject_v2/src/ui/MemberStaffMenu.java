package ui;

import java.util.Scanner;
import ctr.*;

public class MemberStaffMenu {
    private PersonController personController;
    private ProductController productController;
    private Scanner sc;
  
   
    public MemberStaffMenu() {
        personController = new PersonController();
        productController = new ProductController();
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
                    int id;
                    String name = "";
                    String email = "";
                    double balance = 0;
                    
                    
                    
                    System.out.println("Input Customer Id: ");
                    id = sc.nextInt(); String blank = sc.nextLine();
    
                    System.out.println("Input Customer Name: ");
                    name = sc.nextLine();
    
                    System.out.println("Input Customer Email: ");
                    email = sc.nextLine();
    
                    System.out.println("Input Customer balance: ");
                    balance = sc.nextFloat();

                    
                    personController.createCustomer(id, name, email, balance);
                    break;
                case 2:
                    System.out.print("Input the id of the customer you want to find: ");
                    int id1 = sc.nextInt();
                    personController.findPersonInfo(id1);
                    
                    break;
                case 3:
                    System.out.print("Input the id of the customer you want to remove: ");
                    int id2 = sc.nextInt();
                    personController.removePerson(id2);
                    break;
                case 4:
                    int barcode = 0;
                    String productName = "";
                    String description = "";
                    double salesPrice;
                                     
                    
                    System.out.println("Input Product Barcode: ");
                    barcode = sc.nextInt(); String blank2 = sc.nextLine();
                    
                    System.out.println("Input Product Name: ");
                    productName = sc.nextLine();
                    
                    System.out.println("Input Product Description: ");
                    description = sc.nextLine();
                    
                    System.out.println("Input Product Sales Price: ");
                    salesPrice = sc.nextFloat();
                
                    productController.createProduct(barcode, productName, description, salesPrice);
                    break;
                case 5:
                    System.out.println("Input the barcode of the product you want to find: ");
                    int barcode2 = sc.nextInt();
                    productController.findProductInfo(barcode2);
                    break;
                case 6:
                    System.out.println("Input the barcode of the product you want to remove: ");
                    int barcode3 = sc.nextInt();
                    productController.removeProduct(barcode3);
                    break;
                case 0:
                    System.out.println("Goodbye..");
                    running = false;
                    break;
                default:
                    System.out.println("Unknown error with choice = " + choice);
                    break;
            }
        }
    }

    private int writeTheMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Management menu ******");
        System.out.println(" (1) Create a Customer");
        System.out.println(" (2) Find Customer");
        System.out.println(" (3) Remove a Customer");
        System.out.println(" (4) Create a Product");
        System.out.println(" (5) Find a Product");
        System.out.println(" (6) Remove a Product");
        System.out.println(" (0) Back to Main Menu");
        System.out.print("\n Choose:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }

    public void init(PersonController personController) {
        this.personController = personController;
    }
    
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input must be a number - try again");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
}

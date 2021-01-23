package ui;

import java.util.Scanner;
import ctr.PersonController;
import ctr.SaleController;

public class MainMenu {
	private MemberStaffMenu memberStaffMenu;
	private ManagementMenu managementMenu;
	private PersonController personController;
	private SaleController saleController;
	
	public MainMenu() {
        memberStaffMenu = new MemberStaffMenu();
        managementMenu = new ManagementMenu();
        personController = new PersonController();
        saleController = new SaleController();
    }
	
	public void start() {
		mainMenu();
	}
	
	private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                    memberStaffMenu.init(personController);
                    memberStaffMenu.start();
                break;
                case 2:
                	managementMenu.init(saleController);
                	managementMenu.start();
                break;
                case 0:
                System.out.println("Goodbye.");
                running = false;
                break;
                default:
                System.out.println("Unknown error, choice = "+ choice);
                break;
            }
        }
    }

    private int writeMainMenu() {
		Scanner sc = new Scanner(System.in);
        System.out.println("****** Main menu ******");
        System.out.println(" (1) Member Staff Menu");
        System.out.println(" (2) Management Menu");
        System.out.println(" (0) Quit the program");
        System.out.print("\n Choose:");

        while (!sc.hasNextInt()) {
            System.out.println("Input must be a number - try again");
            sc.nextLine();
        }
        int choice = sc.nextInt();
        return choice;
    }
}

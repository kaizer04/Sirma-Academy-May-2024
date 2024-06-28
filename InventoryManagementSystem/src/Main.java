import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InventoryManager inventoryManager = new InventoryManager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the E-commerce Console Application!");

		boolean isRunning = true;
		while (isRunning) {
			displayMenu();
			System.out.print("Enter command (1-4):");
			int choice = scanner.nextInt();
			switch (choice) {
			case 0:
				isRunning = false;
				break;
			case 1:
				inventoryManager.addItem(scanner);
				break;
			case 2:
				inventoryManager.listItems();
				break;
			case 3:
				inventoryManager.getItemsByType();
				break;
			case 4:
				inventoryManager.placeOrder();
			default:
				System.out.println("Invalid command. Please try again.");
			}
		}

		scanner.close();
	}

	private static void displayMenu() {
		System.out.println("What you want to do? Choose from Menu:");
		System.out.println("1. Add Items to Inventory.");
		System.out.println("2. List Inventory Items.");
		System.out.println("3. Categorize Items.");
		System.out.println("4. Place an Order.");
		System.out.println("0. Exit.");
	}
}
import java.io.*;
import java.util.Scanner;

public class InventoryManager {
	private static String writeFilename = "store.txt";

	public void addItem(Scanner scanner) {
		System.out.println("What item type will you add? Choose from Menu:");
		System.out.println("1. " + ItemType.ELECTRONICS + " item.");
		System.out.println("2. " + ItemType.GROCERY + " tems.");
		System.out.println("3. " + ItemType.FRAGILE + " items.");
		int choice = scanner.nextInt();
		ItemType itemType = setItemType(choice);
		System.out.println("You choose to add " + itemType + " item type.");
		System.out.print("Set details: ");
		String details = scanner.next();
		System.out.print("Set description: ");
		String description = scanner.next();
		System.out.print("Set category: ");
		String category = scanner.next();
		System.out.print("Set price: ");
		double price = scanner.nextDouble();

		InventoryItem item = null;
		switch (itemType) {
		case ELECTRONICS:
			System.out.print("Set quantity: ");
			int quantity = scanner.nextInt();
			item = new ElectronicsItem(details, description, price, category, quantity);
			break;
		case GROCERY:
			System.out.print("Set weight: ");
			double weight = scanner.nextDouble();
			item = new GroceryItem(details, description, price, category, weight);
			break;
		case FRAGILE:
			System.out.print("Set quantity: ");
			quantity = scanner.nextInt();
			System.out.print("Set weight: ");
			weight = scanner.nextDouble();
			item = new FragileItem(details, description, price, category, quantity, weight);
		}

		this.writeData(item);
	}

	public void listItems() {
		this.readData();
	}

	public void getItemsByType() {
		System.out.println("Not implemented");
	}

	public void placeOrder() {
		System.out.println("Not implemented");
	}

	private ItemType setItemType(int choice) {
		ItemType itemType = null;
		switch (choice) {
		case 1:
			itemType = ItemType.ELECTRONICS;
			break;
		case 2:
			itemType = ItemType.GROCERY;
			break;
		case 3:
			itemType = ItemType.FRAGILE;
		default:
			System.out.println("Invalid command. Please try again.");
		}

		return itemType;
	}

	private void writeData(InventoryItem item) {
		int id = getLastId() + 1;
		StringBuilder line = new StringBuilder();
		line.append(id);
		line.append(" | ");
		line.append(item.getDetails());
		line.append(" | ");
		line.append(item.getItemType());
		line.append(" | ");
		line.append(item.getPrice());
		line.append(" | ");
		line.append(item.getQuantity());
		line.append(" | ");
		line.append(item.getWeight());
		line.append(" | ");
		line.append(item.getCategory());
		line.append(" | ");
		line.append(item.getDescription());

		try {
			FileWriter fileWriter = new FileWriter(writeFilename, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(line.toString());
			bufferedWriter.newLine();

			// Always close files.
			bufferedWriter.close();

		} catch (IOException ex) {
			System.out.println("Error writing to file '" + writeFilename + "'");
		}
	}

	private int getLastId() {
		String lastLine = "";
		try (BufferedReader br = new BufferedReader(new FileReader(writeFilename))) {
			String line;
			int lines = 0;
			while ((line = br.readLine()) != null) {
				lines++;
				if (lines > 1) {
					lastLine = line;
				}
			}
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + writeFilename + "'");
		}

		String lastId = lastLine == "" ? "0" : lastLine.substring(0, lastLine.indexOf(" | ")).trim();

		return Integer.parseInt(lastId);
	}

	private void readData() {
		try (BufferedReader br = new BufferedReader(new FileReader(writeFilename))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + writeFilename + "'");
		}
	}
}
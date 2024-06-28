public class ElectronicsItem extends InventoryItem {

	public ElectronicsItem(String details, String description, double price, String category,
			int quantity) {
		super(details, description, price, category, ItemType.ELECTRONICS, quantity);
	}

	@Override
	public double calculateValue() {
		return this.getPrice() * this.getQuantity();
	}
}

public class GroceryItem extends InventoryItem {

	public GroceryItem(String details, String description, double price, String category, double weight) {
		super(details, description, price, category, ItemType.GROCERY, weight);
	}

	@Override
	public double calculateValue() {
		return this.getPrice() * this.getWeight();
	}
}
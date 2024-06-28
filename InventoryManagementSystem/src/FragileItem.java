public class FragileItem extends InventoryItem {
	private double weight;

	public FragileItem(String details, String description, double price, String category, int quantity, double weight) {
		super(details, description, price, category, ItemType.FRAGILE, quantity, weight);
	}

	@Override
	public double calculateValue() {
		return this.getPrice() * this.getQuantity() * this.getWeight();
	}
}


public class InventoryItem extends AbstractItem {
	private String id;
	private int quantity;
	private ItemType itemType;
	private double weight;

	public InventoryItem(String details, String description, double price, String category, ItemType itemType,
			int quantity) {
		super(details, description, price, category);
		this.quantity = quantity;
		this.itemType = itemType;
	}

	public InventoryItem(String details, String description, double price, String category, ItemType itemType,
			double weight) {
		super(details, description, price, category);
		this.itemType = itemType;
		this.weight = weight;
	}

	public InventoryItem(String details, String description, double price, String category, ItemType itemType,
			int quantity, double weight) {
		super(details, description, price, category);
		this.itemType = itemType;
		this.quantity = quantity;
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public double getWeight() {
		return weight;
	}
}
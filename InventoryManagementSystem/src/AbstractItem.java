import Interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
	private String details;
	private String description;
	private boolean isBreakable;
	private boolean isPerishable;
	private double price;
	private String category;

	public AbstractItem(String details, String description, double price, String category) {
		this.details = details;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	@Override
	public String getDetails() {
		return this.details;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getCategory() {
		return this.category;
	}

	@Override
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public double calculateValue() {
		return this.price;
	}

	@Override
	public void displayItemDescription() {
		System.out.println(this.description);
	}

	@Override
	public boolean isBreakable() {
		return this.isBreakable;
	}

	@Override
	public void handleItemBreakage() {
		System.out.println("Handling item breakage.");
	}

	@Override
	public boolean isPerishable() {
		return this.isPerishable;
	}

	@Override
	public void handleItemExpiration() {
		System.out.println("Handling item expiration..");
	}
}
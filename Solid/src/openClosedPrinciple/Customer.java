package openClosedPrinciple;

public class Customer implements Discount {
	@Override
	public double calculateDiscount(double price) {
		return price;
	}
}
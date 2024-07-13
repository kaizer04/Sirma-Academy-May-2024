package openClosedPrinciple;

public class Senior extends Customer implements Discount {
	private final double discount = 0.2;
	@Override
	public double calculateDiscount(double price) {
		return price * this.discount;
	}
}
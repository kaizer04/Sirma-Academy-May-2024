package openClosedPrinciple;

public class Student extends Customer implements Discount {
	private final double discount = 0.1;
	@Override
	public double calculateDiscount(double price) {
		return price * this.discount;
	}
}
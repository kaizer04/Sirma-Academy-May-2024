package singleResponsibilityPrinciple;

public class Invoice {
	private double amount;
	private String customerName;

	public Invoice(double amount, String customerName) {
		this.amount = amount;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"amount=" + this.amount +
				", customerName='" + this.customerName + '\'' +
				'}';
	}
}
package singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class InvoiceDataBase {
	private List<Invoice> db = new ArrayList<>();

	public void saveInvoice(Invoice invoice) {
		db.add(invoice);
	}
}
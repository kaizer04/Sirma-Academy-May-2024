package singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class BookDataBase {
	private List<Book> db = new ArrayList<>();

	public void saveToDatabase(Book book) {
		db.add(book);
	}
}
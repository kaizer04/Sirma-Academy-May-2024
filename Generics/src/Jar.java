import java.util.Deque;
import java.util.NoSuchElementException;

//1. Jar of T
public class Jar<E> {
	private final Deque<E> items;

	public Jar() {
		this.items = null;
	}

	public void add(E item) {
		this.items.push(item);
	}

	public E remove() {
		if (items.isEmpty()) {
			throw new NoSuchElementException("The jar is empty!");
		}

		return items.pop();
	}
}
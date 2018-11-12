package ehandel;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> items = new ArrayList<>();
	
	public List<OrderItem> getItems() {
		return items;
	}

	public void add(String product, int quantity) {
		items.add(new OrderItem(product, quantity));
	}
}

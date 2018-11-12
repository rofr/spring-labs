package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<OrderItem> items = new ArrayList<>();
	
	public void add(String product, int amount) {
		getItems().add(new OrderItem(product, amount));
	}

	public List<OrderItem> getItems() {
		return items;
	}
}

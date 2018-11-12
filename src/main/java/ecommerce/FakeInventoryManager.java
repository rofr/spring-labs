package ecommerce;

import java.util.HashMap;
import java.util.Map;

public class FakeInventoryManager implements InventoryManager {

	Map<String,Integer> inventory;
	

	public FakeInventoryManager() {
		this.inventory = new HashMap<String, Integer>();
	}

	
	public synchronized int getInventoryLevel(String product) {
		return inventory.getOrDefault(product, 0);
	}
	
	public synchronized void adjustInventoryLevel(String product, int deltaLevel) {
		inventory.putIfAbsent(product, 0);
		int newLevel = inventory.get(product) + deltaLevel;
		inventory.put(product, newLevel);
		System.out.println("Product: " + product + ", level: " + newLevel);
	}

}

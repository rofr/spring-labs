package ehandel;

public interface InventoryManager {

	int getInventoryLevel(String productId);
	
	void adjustInventoryLevel(String product, int deltaLevel);
}

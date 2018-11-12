package ehandel;

public class OrderProcessor {

	//TODO: initialize fields using Spring DI
	private InventoryManager inventoryManager;	
	private OrderRepository orderRepository;

	public synchronized void placeOrder(ShoppingCart cart) {
		Order order = new Order();
		for(OrderItem item: cart.getItems()) {
			order.add(item.getProduct(), item.getQuantity());
			inventoryManager.adjustInventoryLevel(
					item.getProduct(), 
					-item.getQuantity());
		}
		
		orderRepository.saveOrder(order);
	}
}

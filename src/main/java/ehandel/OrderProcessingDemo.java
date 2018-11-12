package ehandel;

import org.springframework.context.ApplicationContext;

public class OrderProcessingDemo {
	
	public static void runDemo(ApplicationContext ctx) {
		InventoryManager inventoryManager = ctx.getBean(InventoryManager.class);
		
		//Add some items to inventory
		inventoryManager.adjustInventoryLevel("balls", 30);
		inventoryManager.adjustInventoryLevel("racket", 10);
		
		ShoppingCart cart = new ShoppingCart();
		cart.getItems().add(new OrderItem("balls", 4));
		cart.getItems().add(new OrderItem("racket", 1));
	
		OrderProcessor processor = ctx.getBean(OrderProcessor.class);
		processor.placeOrder(cart);		
	}
}
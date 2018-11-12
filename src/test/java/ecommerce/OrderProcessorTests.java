package ecommerce;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ecommerce.FakeInventoryManager;
import ecommerce.FakeOrderRepository;
import ecommerce.OrderProcessor;
import ecommerce.ShoppingCart;

public class OrderProcessorTests {
	
	@Test
	public void orderProcessorAdjustsInventory() {
		
		//Arrange
		FakeInventoryManager inventoryManager = new FakeInventoryManager();
		FakeOrderRepository or = new FakeOrderRepository();

		//TODO: create an instance based on the DI approach you chose in exercise 1
		OrderProcessor orderProcessor = null; 
		
		inventoryManager.adjustInventoryLevel("balls", 30);
		inventoryManager.adjustInventoryLevel("racket", 10);
			
		ShoppingCart cart = new ShoppingCart();
		cart.add("balls", 4);
		cart.add("racket", 1);
		
		//Act
		orderProcessor.placeOrder(cart);
		
		//Assert
		assertEquals(26, inventoryManager.getInventoryLevel("balls"));
		assertEquals(9, inventoryManager.getInventoryLevel("racket"));
		
	}

}

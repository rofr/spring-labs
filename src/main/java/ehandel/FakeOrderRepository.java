package ehandel;

public class FakeOrderRepository implements OrderRepository {

	public void saveOrder(Order order) {
		
		System.out.println("------- Saving order -------");
		for(OrderItem item: order.getItems()) {
			System.out.println(item);
		}

	}

}

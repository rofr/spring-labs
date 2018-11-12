package ehandel;

public class OrderItem {
	
	private String product;
	private int quantity;	
	
	public OrderItem(String product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public String getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "OrderItem [product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}

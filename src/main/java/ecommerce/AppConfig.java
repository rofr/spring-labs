package ecommerce;

import org.springframework.context.ApplicationContext;

public class AppConfig {

	public static void main(String[] args) {
		
		System.out.println("--- Running AppConfig.main() ---");
		
		//TODO: Create and initialize an ApplicationContext based on annotations
		ApplicationContext ctx = null;

		OrderProcessingDemo.runDemo(ctx);
		
	}

}

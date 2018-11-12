package ecommerce;

import org.springframework.context.ApplicationContext;

public class JavaConfig {

	public static void main(String[] args) {
		
		System.out.println("--- Running JavaConfig.main() ---");
		
		//TODO: Create and initialize a context using Java Configuration
		ApplicationContext ctx = null;
		
		OrderProcessingDemo.runDemo(ctx);
	}

}

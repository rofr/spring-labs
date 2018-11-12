package aop;

import org.springframework.stereotype.Component;

@Component
public class Greeter {

	public void sayHello() throws InterruptedException {
		System.out.print("Wait for it...");
		Thread.sleep(2000);
		System.out.println("Hello!");
	}
}

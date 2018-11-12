package aop;

import org.springframework.beans.factory.config.BeanDefinition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class AopApplication {
	
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopApplication.class);
		Greeter greeter = ctx.getBean(Greeter.class);
		System.out.println(greeter.getClass());
		greeter.sayHello();
		
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
			BeanDefinition bd = ctx.getBeanDefinition(beanName);
		}
	}
}

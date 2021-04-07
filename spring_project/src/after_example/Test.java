package after_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("afterexampleContext.xml");
		Operation e = (Operation) context.getBean("opBean1");
		System.out.println("calling m...");
		e.m();
		System.out.println("calling k...");
		e.k();

	}

}

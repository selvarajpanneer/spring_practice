package factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("FactoryMethodContext.xml");  
	    PersonA person_a=(PersonA)context.getBean("persona");  
	    person_a.msg();  

	}

}

package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("autoWiringContext.xml");  
		    Person1 person_1=context.getBean("person1",Person1.class);  
		    person_1.display();  

	}

}

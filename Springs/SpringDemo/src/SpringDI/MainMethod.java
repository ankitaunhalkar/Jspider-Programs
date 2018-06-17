package SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
	//Engine e=context.getBean(Engine.class);
	Car c=context.getBean(Car.class);
	//c.e=e;
	c.move();
	
	
}
}

package AssignProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring-config.xml");
	/*Student s1=ac.getBean(Student.class);
	Student s2=ac.getBean(Student.class);

	//s.details();
	//Test Scope
	System.out.println(s1);
	System.out.println(s2);*/
	
	Student s=ac.getBean(Student.class);
	s.details();
}
}

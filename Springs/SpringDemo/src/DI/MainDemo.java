package DI;

import java.util.Scanner;

public class MainDemo {
public static void main(String[] args) {
	//1st Logic
	/*Car c=new Car();
	c.move();*/
	
	//2nd Logic
	/*Engine eng=new Engine();
	Car c=new Car();
	c.e=eng;
	c.move();*/
	
	//3rd Logic
	Scanner s=new Scanner(System.in);
	String type=s.next();
	Factory f=new Factory();
	Engine e1=f.getEngine(type);
	Car c=new Car();
	c.e=e1;
	c.move();
	
	
}
}

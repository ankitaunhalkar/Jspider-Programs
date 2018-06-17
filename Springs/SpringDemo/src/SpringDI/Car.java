package SpringDI;
public class Car {
	Engine e;
	void move()
	{
	e.start();
	System.out.println("Car is Moving");
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
}

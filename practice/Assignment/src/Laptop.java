
public class Laptop implements Comparable{
String name;
int price;
int ram;
String proccessor;

Laptop(String name,int price,int ram,String proccessor)
{
	this.name=name;
	this.price=price;
	this.ram=ram;
	this.proccessor=proccessor;
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.price;
	}

@Override
	public boolean equals(Object obj) {
		Laptop obj1=(Laptop)obj;
		if(this.price==obj1.price && this.name.equals(obj1.name) && this.proccessor.equals(obj1.proccessor) && this.ram==obj1.ram)
		{
			return true;
		}
		return false;
	}

@Override
	public String toString() {
		
		return "Laptop [ name="+name+", price="+price+", ram="+ram+", proccessor="+proccessor+"]";
	}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Laptop obj1=(Laptop)o;
	return this.hashCode()-obj1.hashCode();
}


	
}

package AssignProperty;

public class Student {
  int id;
  String name;
  Address a;

/*public Student(int id, String name, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.a=add;
}*/
  public Student(Address add) {	
		this.a=add;
	}
void details(){
	System.out.println("Name: "+name);
	System.out.println("Id: "+id);
	System.out.println("Address: "+a.location);
}
public Address getA() {
	return a;
}

public void setA(Address a) {
	this.a = a;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

/*@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
*/
}

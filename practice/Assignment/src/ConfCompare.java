import java.util.Comparator;

public class ConfCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Laptop object1= (Laptop)o1;
		Laptop object2= (Laptop)o2;
		return -object1.compareTo(object2);
		
	}

	
	

}

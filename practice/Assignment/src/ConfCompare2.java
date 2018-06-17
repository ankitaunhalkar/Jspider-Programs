import java.util.Comparator;

public class ConfCompare2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Laptop object1= (Laptop)o1;
		Laptop object2= (Laptop)o2;
		return object1.proccessor.compareTo(object2.proccessor);
		
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		
	
Laptop l1=new Laptop("Dell", 23000, 4, "i3");
Laptop l2=new Laptop("Lenovo", 25000, 8, "i5");
Laptop l3=new Laptop("Samsung", 24000, 4, "i5");
Laptop l4=new Laptop("Asus", 28000, 4, "i7");

List<Laptop> hs= new ArrayList<Laptop>();
hs.add(l1);
hs.add(l2);
hs.add(l3);
hs.add(l4);

//Collections.sort(hs,Collections.reverseOrder());//inbuilt
//Collections.sort(hs,new ConfCompare());
Collections.sort(hs,new ConfCompare2());
for(Laptop l: hs)
{
	System.out.println(l);
}
	}
}

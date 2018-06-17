package patterns;
/**
A
BC
DEF
GHIJ

 * @author HP
 *
 */
public class Char_display 
{
public static void main(String[] args) {
	int k=0;
	for (int i = 1; i<5; i++) {
		for (int j = 1; j<= i; j++) {
			
		
		System.out.print((char)((65+k)));
		k++;
	}
	System.out.println();
}
}
}


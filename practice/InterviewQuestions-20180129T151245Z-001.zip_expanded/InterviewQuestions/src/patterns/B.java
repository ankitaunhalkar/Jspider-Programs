

package patterns;
/**
 *  1
   12
  123
 1234
12345
 *
 */
public class B {
public static void main(String[] args) {
	int n=5;
	int z=1;
	for (int i = 1; i <=n; i++) {
		for (int j =4; j>=i; j--) {
			System.out.print(" ");
		}
	
for (int k=1; k <=z; k++) {
			System.out.print(k);
		}
z++;
		System.out.println();
	}
}
}
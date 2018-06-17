package patterns;
/**
 *  1
   22
  333
 4444
55555
55555
 4444
  333
   22
    1
*/
public class PascalTrl {
public static void main(String[] args) {
	int n=5;
	int z=1;
	for (int i = 1; i <=n; i++) {
		for (int j =4; j>=i; j--) {
			System.out.print(" ");
		}
	
for (int k=1; k <=z; k++) {
			System.out.print(z );                                               
					}
z++;
		System.out.println();
	}
	for (int i = n; i >=1; i--) {
		for (int j =n; j>i; j--) {
			System.out.print(" ");
		}
	
for (int k=1; k <=i; k++) {
			System.out.print(i);
		}

		System.out.println();
}
}
}








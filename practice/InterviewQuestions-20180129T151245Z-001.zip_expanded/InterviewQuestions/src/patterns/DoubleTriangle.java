package patterns;
/**
 *  1
   12
  123
 1234
12345
12345
 1234
  123
   12
    1

 */
public class DoubleTriangle {
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
	for (int i = n; i >=1; i--) {
		for (int j =n; j>i; j--) {
			System.out.print(" ");
		}
	
for (int k=1; k <=i; k++) {
			System.out.print(k);
		}

		System.out.println();
}
}
}




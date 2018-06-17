package patterns;
/**
 
  *
 ***
*****
  */
public class TriangleStar {
	public static void main(String[] args) {
		int n=2;
		
			for (int i = 0; i <=n; i++) {
			for (int j =0; j <=n-i-1; j++) {
	
			System.out.print(" ");
		}
			for (int z = 0; z <=i; z++) {
				System.out.print('*');
			}
			
		for (int x = 0; x <i; x++) {
			System.out.print('*');
		}
		
		System.out.println();
	}
}
}
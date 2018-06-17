package patterns;
/**
 				1	
 	 	 	1	2	3	
 	 	1	2	3	4	5	
 	1	2	3	4	5	6	7	
1	2	3	4	5	6	7	8	9	

 */
public class A1 {
public static void main(String[] args) {
	int n=5;
int z=1;
for (int i =1; i <=n; i++) {
		for (int j =n-1; j>=i; j--) {
			System.out.print(" "+"\t");
		}
		for (int k =1; k <=z; k++) {
				System.out.print(k+"\t");
			}
			z=z+2;
			System.out.println();
		}
	}
}



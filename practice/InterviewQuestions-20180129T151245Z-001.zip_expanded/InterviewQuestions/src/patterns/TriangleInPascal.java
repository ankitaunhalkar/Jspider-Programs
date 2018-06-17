package patterns;
//this is to display prime numbers
/**
 * 				1	
 	 	 	3	3	3	
 	 	5	5	5	5	5	
 	7	7	7	7	7	7	7	
9	9	9	9	9	9	9	9	9	

 * @author HP
 *
 */
public class TriangleInPascal
{
public static void main(String[] args) {
	int n=5;
	int num=1;     //To Display EVEN numbers int num=2;
	for (int i = 0; i <n; i++) {
		for (int j = 0; j <n-i-1; j++) {
			System.out.print(" "+"\t");
		}
		for (int z = 0; z <=i; z++) {
			System.out.print(num+"\t");
		}

		for (int x = 0; x <i; x++) {
			System.out.print(num+"\t");
	}
	num=num+2;                   //if num++; then o/p is  				    1	
	 							//										2	2	2	
	 							//									3	3	3	3	3	
	 							//								4	4	4	4	4	4	4	
	 							//							5	5	5	5	5	5	5	5	5	//

	System.out.println();
}
}
}
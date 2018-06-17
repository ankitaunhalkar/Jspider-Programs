package patterns;
/**
1	
3	3	
5	5	5	
7	7	7	7	
9	9	9	9	9	

 * @author HP
 *
 */
public class PrimaryNoInTriangle {
public static void main(String[] args) {
	int n=5;
	int num=1;                                // for EVEN Numbers put int num=2 or int num=0;
	for (int i = 0; i <n; i++) {
		for (int j =0; j <=i; j++) {
			
			System.out.print(num+"\t");
		}
		num=num+2;
			System.out.println();
	}
}
}
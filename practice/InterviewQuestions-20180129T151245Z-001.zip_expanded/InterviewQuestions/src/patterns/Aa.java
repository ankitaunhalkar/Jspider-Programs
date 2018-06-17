package patterns;
/** 
* 
**
***
****
*****
*****
****
***
**
*
* */
public class Aa {
public static void main(String[] args) {
	for (int i = 1; i<=5; i++) {
		for (int j =1; j<=i; j++) {
		System.out.print('*' );	
		}
		System.out.println();
	}
		for (int k =5; k>=1; k--) {
		for (int x =1; x<=k; x++)
		{
			System.out.print('*');
		}
		System.out.println();
		}

	}
}


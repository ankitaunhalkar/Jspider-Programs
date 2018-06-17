package patterns;

public class Pattern1 {
public static void main(String[] args) {
	
	char ch='a';
	
	for (int i = 0; i <5; i++) {
		
		for (int j = 0; j <5; j++) {
			
			if(i==j){
				System.out.print(ch);
				ch++;

			}else{
				System.out.print("\t");
			}
		}
		
		System.out.println();
	}
	
	
	for (String string : args) {
		
	}
}
}


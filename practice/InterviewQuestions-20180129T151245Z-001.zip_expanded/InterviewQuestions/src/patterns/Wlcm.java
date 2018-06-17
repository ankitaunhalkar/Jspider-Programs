package patterns;

public class Wlcm {
public static void main(String[] args) {
	String g="WELCOME";
	char[] ch=g.toCharArray();
	int k=0;
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
		for (int j = 0; j <26; i++){
			{
				char v=(char)(65+k);
				System.out.print(v);
				k++;
				if(ch[v]==ch[i]){
				System.out.print(ch[i]);
				}
		
	}
}
}
}
}

public class DuplicateElement {
public static void main(String[] args) {
	String[] str={"ank","nik","dip","ank"};
	int len=str.length;
	String temp = null;
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++)
		{
		if(str[i]==str[j])
		{
			temp=str[i];
		}
		}
int k=0;
		while(str[k]==temp)
		{
			
			System.out.println(str[k]);	
			
		}
		
	}
	
}
}

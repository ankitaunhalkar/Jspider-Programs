
public class Triplet {
public static void main(String[] args) {
	int a[]={5,1,3,4,7};int count=0;
	int sum=12;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			for (int k = j+1; k < a.length; k++) {
				if(a[i]+a[j]+a[k]<sum)
				{
					count++;
					System.out.println("count: "+count);
					System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
				}
			}
			
		}
	}
	
	/*for (int i = a.length-1; i >= 0; i--) {
		for (int j = i-1; j >=0; j--) {
			for (int k = j-1; k >= 0; k--) {
				if(a[i]+a[j]+a[k]<sum)
				{
					count++;
					System.out.println("count: "+count);
					System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
				}
			}
			
		}
	}*/
}
}

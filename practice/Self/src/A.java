
interface Q{
	void m();
}
interface P{
	void m();
}
public class A implements P,Q{
	
	/*A a=new A();*/
/*static void my()
{
	System.out.println("running");
}*/
public static void main(String[] args) {
	/*A a=null;
	a.my();*/
	/*A a=new A();*/
	/*String s="abc";
	if("abc".trim()==s)
	{
		System.out.println("equals");
	}*/
	P p=new A();
	p.m();
	
}

	@Override
	public void m() {
	System.out.println("Run");
		
	}
}

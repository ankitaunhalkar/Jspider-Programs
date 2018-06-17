package DI;

public class Factory {
Engine getEngine(String eng)
{
	Engine e = null;
	if(eng.equals("e1"))
	{
		 e=new Engine();
	}
	return e;
}
}

package sr.ice.server;

import Ice.Current;
import Ice.LocalObjectHolder;
import Ice.Object;
import Ice.UserException;
import sr.ice.impl.CalcI;




public class ServantLocatorK2 implements Ice.ServantLocator
{
	private Object k2 = null;
	
	public ServantLocatorK2(String id)
	{
		System.out.println("Constructor Servant Locator "+ id+ ".");
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		Object servant = null;
			k2 = new CalcI();
			servant = k2;
			System.out.println("Locate : Cat: "+curr.id.category+ " Name: "+curr.id.name);
			System.out.println("Servant: "+ servant.toString());
		return servant;
	}



	public void finished(Ice.Current curr, Ice.Object servant, java.lang.Object cookie) throws UserException 
	{
			k2=null;
	}

	public void deactivate(String category){};
}


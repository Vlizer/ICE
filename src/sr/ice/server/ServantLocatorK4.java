package sr.ice.server;

import Ice.Current;
import Ice.Identity;
import Ice.LocalObjectHolder;
import Ice.Object;
import Ice.UserException;
import sr.ice.impl.CalcI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;




public class ServantLocatorK4 implements Ice.ServantLocator
{
	private Object k4 = null;
	
	public ServantLocatorK4(String id)
	{
		k4=new CalcI();
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		Object servant = null;
				servant=k4;
			System.out.println("Locate : Cat: "+curr.id.category+ " Name: "+curr.id.name);
			System.out.println("Servant: "+ servant.toString());
		return servant;
	}

	public void finished(Ice.Current curr, Ice.Object servant, java.lang.Object cookie) throws UserException 
	{
	}

	public void deactivate(String category){};
}


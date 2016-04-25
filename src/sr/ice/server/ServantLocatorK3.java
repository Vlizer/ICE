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




public class ServantLocatorK3 implements Ice.ServantLocator
{
	private List<Object> k3 = new ArrayList<Object>();
	private int k2Index = 0;
	private int maxIndex=5;
	
	public ServantLocatorK3(String id)
	{
		System.out.println("Constructor Servant Locator "+ id+ ".");
		for(int i=0;i<maxIndex;i++){
			k3.add(new CalcI());
		}
		
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		Object servant = null;
				servant = k3.get(k2Index++);
				k2Index%=maxIndex;
			System.out.println("Locate : Cat: "+curr.id.category+ " Name: "+curr.id.name);
			System.out.println("Servant: "+ servant.toString());
		return servant;
	}
	public void finished(Ice.Current curr, Ice.Object servant, java.lang.Object cookie) throws UserException 
	{
		
	
	}

	public void deactivate(String category){};
}


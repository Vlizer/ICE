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




public class ServantLocatorK1 implements Ice.ServantLocator
{
	private Object k1 = null;
	private Object k2 = null;
	private List<Object> k3 = new ArrayList<Object>();
	private int k2Index = 0;
	private int maxIndex=5;
	private Object k4 = null;
	private Map<String,Object> k5 = new HashMap<String, Object>();
	private Queue<String> lastAccessedAccount = new LinkedList<String>();
	private int k5Limit = 5;
	
	
	private Ice.ObjectAdapter adapter;
	private FileSaver fileSaver = new FileSaver();
	
	public ServantLocatorK1(String id,Ice.ObjectAdapter adapter)
	{
		System.out.println("Constructor Servant Locator "+ id+ ".");
		this.adapter = adapter;
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		Object servant = null;
				k1=fileSaver.loadK1(curr.id.name);
				servant = k1;
			System.out.println("Locate : Cat: "+curr.id.category+ " Name: "+curr.id.name);
			System.out.println("Servant: "+ servant.toString());
		return servant;
	}

	public void finished(Ice.Current curr, Ice.Object servant, java.lang.Object cookie) throws UserException 
	{
				adapter.add(k1, new Identity(curr.id.name,"k1"));
				System.out.println("Finished: Add K1 to adapter");
	}

	public void deactivate(String category){};
}


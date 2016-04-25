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




public class ServantLocatorK5 implements Ice.ServantLocator
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
	
	public ServantLocatorK5(String id)
	{
		System.out.println("Constructor Servant Locator "+ id+ ".");
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		Object servant = null;
				if(k5.containsKey(curr.id.name)){
					servant=k5.get(curr.id.name);
				}else if(lastAccessedAccount.size() >= k5Limit){
					saveLastAccessedAccount();
					servant = new CalcI();
					k5.put(curr.id.name, servant);
				}else{
					servant = loadServant(curr.id.name);
				}
			System.out.println("Locate : Cat: "+curr.id.category+ " Name: "+curr.id.name);
			System.out.println("Servant: "+ servant.toString());
		return servant;
	}

	private Object loadServant(String name) {
		Object object = fileSaver.loadFromFile(name);
		if(object == null){
			Object t = new CalcI();
			k5.put(name, t);
			lastAccessedAccount.add(name);
			return t;
		}
		return object;
		
	}

	private void saveLastAccessedAccount() {
		String lastAccessedId = lastAccessedAccount.poll();
		Object lastAccessedServant = k5.get(lastAccessedId);
		
		fileSaver.saveToFile(lastAccessedId,lastAccessedServant);
		k5.remove(lastAccessedId);
		
	}

	public void finished(Ice.Current curr, Ice.Object servant, java.lang.Object cookie) throws UserException 
	{
		
	
	}

	public void deactivate(String category){};
}


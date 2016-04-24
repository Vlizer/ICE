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

import Demo.*;



public class ServantLocator implements Ice.ServantLocator
{
	private String id = null;
	private Object k1 = null;
	private Object k2 = null;
	private List<Object> k3 = new ArrayList<Object>();
	private int k2Index = 0;
	private int maxIndex=5;
	private Object k4 = null;
	private Map<String,Object> k5 = new HashMap();
	private Queue<String> lastAccessedAccount = new LinkedList<String>();
	private int k5Limit = 5;
	
	
	private Ice.ObjectAdapter adapter;
	private FileSaver fileSaver = new FileSaver();
	
	public ServantLocator(String id,Ice.ObjectAdapter adapter)
	{
		this.id = id;
		this.adapter = adapter;
		System.out.println("## ServantLocator(" + id + ") ##");
		for(int i=0;i<maxIndex;i++){
			k3.add(new CalcI());
		}
		k4=new CalcI();
		
	}

	

	public Object locate(Current curr, LocalObjectHolder cookie) throws UserException 
	{
		System.out.println("## ServantLocator #" +id + " .locate() ##");
		Object servant = null;
			if(curr.id.category.equalsIgnoreCase("k1")){
				k1=fileSaver.loadK1(curr.id.name);
				servant = k1;
			}
			else if(curr.id.category.equalsIgnoreCase("k2")){
				k2 = new CalcI();
				servant = k2;
			}else if(curr.id.category.equalsIgnoreCase("k3")){
			
				servant = k3.get(k2Index++);
				if(servant == null){
					System.out.println("PROBLEM");
				}
				k2Index%=maxIndex;
			}else if(curr.id.category.equalsIgnoreCase("k4")){
				servant=k4;
			}else if(curr.id.category.equalsIgnoreCase("k5")){
				if(k5.containsKey(curr.id.name)){
					servant=k5.get(curr.id.name);
				}else if(lastAccessedAccount.size() >= k5Limit){
					saveLastAccessedAccount();
				}else{
					servant = loadServant(curr.id.name);
				}
			}
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
		System.out.println("## ServantLocator #" +id + " .finished() ##");
		if(curr.id.category.equalsIgnoreCase("k1")){
				adapter.add(k1, new Identity(curr.id.name,"k1"));
		}
		else if(curr.id.category.equalsIgnoreCase("k2")){
			k2=null;
		}
	
	}

	public void deactivate(String category)
	{
		System.out.println("## ServantLocator #" +id + " .deactivate() ##");
	}
}


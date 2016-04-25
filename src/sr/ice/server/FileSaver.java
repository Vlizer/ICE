package sr.ice.server;
import java.util.HashMap;
import java.util.Map;

import Ice.Object;
import sr.ice.impl.CalcI;
public class FileSaver {
private Map<String,Object> DB = new HashMap<String,Object>();
private Map<String,Object> k1 = new HashMap<String,Object>();	
	
	public synchronized Object loadFromFile(String name){
		return DB.get(name);	
	}

	public synchronized void  saveToFile(String lastAccessedId, Object lastAccessedServant) {
		DB.put(lastAccessedId, lastAccessedServant);		
	}

	public synchronized Object loadK1(String name) {
		if(k1.containsKey(name)){
			return k1.get(name);
		}else{
			Object t = new CalcI();
			k1.put(name, t);
			return t;
		}
	}
}

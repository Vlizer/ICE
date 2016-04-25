package sr.ice.server;


public class Server
{
	public void t1(String[] args)
	{
		int status = 0;
		Ice.Communicator communicator = null;

		try
		{
			System.out.println("Server : Creating comunicator");
			communicator = Ice.Util.initialize(args);
			System.out.println("Server : Creating Adapter");
			Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("Adapter1", 
					"tcp -h localhost -p 10000:udp -h localhost -p 10000");

//			System.out.println("Server :Creating ServantLocator");
//			ServantLocator locator = new ServantLocator("temp", adapter);
//			

			System.out.println("Server :Creating ServantLocatorK1");
			ServantLocatorK1 locatorK1 = new ServantLocatorK1("temp",adapter);

			System.out.println("Server :Creating ServantLocatorK2");
			ServantLocatorK2 locatorK2 = new ServantLocatorK2("temp");

			System.out.println("Server :Creating ServantLocatorK3");
			ServantLocatorK3 locatorK3 = new ServantLocatorK3("temp");

			System.out.println("Server :Creating ServantLocatorK4");
			ServantLocatorK4 locatorK4 = new ServantLocatorK4("temp");
			
			System.out.println("Server :Creating ServantLocatorK5");
			ServantLocatorK5 locatorK5 = new ServantLocatorK5("temp");
			
			
			
			System.out.println("Server : Adding Servant Locator k1");
			adapter.addServantLocator(locatorK1, "k1");
			System.out.println("Server : Adding Servant Locator k2");
			adapter.addServantLocator(locatorK2, "k2");
			System.out.println("Server : Adding Servant Locator k3");
			adapter.addServantLocator(locatorK3, "k3");
			System.out.println("Server : Adding Servant Locator k4");
			adapter.addServantLocator(locatorK4, "k4");
			System.out.println("Server : Adding Servant Locator k5");
			adapter.addServantLocator(locatorK5, "k5");
			adapter.activate();
			System.out.println("Entering event processing loop...");
			communicator.waitForShutdown();
		}
		
		catch (Exception e)
		{
			System.err.println(e);
			status = 1;
		}
		if (communicator != null)
		{
			try
			{
				communicator.destroy();
			}
			catch (Exception e)
			{
				System.err.println(e);
				status = 1;
			}
		}
		System.exit(status);
	}


	public static void main(String[] args)
	{
		Server app = new Server();
		app.t1(args);
	}
}	

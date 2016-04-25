package sr.ice.client;

import Demo.*;

public class Client
{
	public static void main(String[] args) {
		Client c = new Client();
		Ice.Communicator communicator = null;
		communicator = Ice.Util.initialize(args);
		
		c.t1("k1/c111", args,communicator);
		c.t1("k1/c112", args,communicator);
		c.t1("k1/c113", args,communicator);
		c.t1("k1/c114", args,communicator);
		c.t1("k1/c115", args,communicator);
		c.t1("k1/c116", args,communicator);
		c.t1("k1/c117", args,communicator);
		c.t1("k1/c118", args,communicator);
		c.t1("k1/c119", args,communicator);
		
		c.t1("k2/c111", args,communicator);
		c.t1("k2/c112", args,communicator);
		c.t1("k2/c113", args,communicator);
		c.t1("k2/c114", args,communicator);
		c.t1("k2/c115", args,communicator);
		c.t1("k2/c116", args,communicator);
		c.t1("k2/c117", args,communicator);
		c.t1("k2/c118", args,communicator);
		c.t1("k2/c119", args,communicator);
		
		c.t1("k3/c111", args,communicator);
		c.t1("k3/c112", args,communicator);
		c.t1("k3/c113", args,communicator);
		c.t1("k3/c114", args,communicator);
		c.t1("k3/c115", args,communicator);
		c.t1("k3/c116", args,communicator);
		c.t1("k3/c117", args,communicator);
		c.t1("k3/c118", args,communicator);
		c.t1("k3/c119", args,communicator);
		
		c.t1("k4/c111", args,communicator);
		c.t1("k4/c112", args,communicator);
		c.t1("k4/c113", args,communicator);
		c.t1("k4/c114", args,communicator);
		c.t1("k4/c115", args,communicator);
		c.t1("k4/c116", args,communicator);
		c.t1("k4/c117", args,communicator);
		c.t1("k4/c118", args,communicator);
		c.t1("k4/c119", args,communicator);
		
		c.t1("k5/c111", args,communicator);
		c.t1("k5/c112", args,communicator);
		c.t1("k5/c113", args,communicator);
		c.t1("k5/c114", args,communicator);
		c.t1("k5/c115", args,communicator);
		c.t1("k5/c116", args,communicator);
		c.t1("k5/c117", args,communicator);
		c.t1("k5/c111", args,communicator);
		c.t1("k5/c112", args,communicator);
//		if (communicator != null) {
//			try {
//				communicator.destroy();
//			} catch (Exception e) {
//				System.err.println(e.getMessage());
//				
//			}
//		}
		try {
			Thread.currentThread().sleep(40*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (communicator != null) {
			try {
				communicator.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				
			}
		}
	}
	public void t1(String name,String[] args, Ice.Communicator communicator)
	{
		int status = 0;
		//Ice.Communicator communicator = null;

		try {
			System.out.println("--------------------------------------");
			System.out.println("Client : Creating Communicator");
			//communicator = Ice.Util.initialize(args);
			System.out.println("Client : Creating Base");
			Ice.ObjectPrx base = communicator.stringToProxy(name+":tcp -h localhost -p 10000:udp -h localhost -p 10000:ssl -h localhost -p 10001");
			System.out.println("Client : Calc Proxy");
			CalcPrx calc = CalcPrxHelper.checkedCast(base);
			if (calc == null) throw new Error("Invalid proxy");
			String line = null;
			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

			
			System.out.println("Client : Start");
			System.out.println(calc.add1(7, 8));

			System.out.println("--------------------------------------");

		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
//		if (communicator != null) {
//			try {
//				communicator.destroy();
//			} catch (Exception e) {
//				System.err.println(e.getMessage());
//				status = 1;
//			}
//		}
	}
}
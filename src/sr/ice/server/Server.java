// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package sr.ice.server;

import Demo.*;
import Ice.Identity;
import sr.ice.impl.CalcI;

public class Server
{
	public void t1(String[] args)
	{
		int status = 0;
		Ice.Communicator communicator = null;

		try
		{
			// 1. Inicjalizacja ICE
			communicator = Ice.Util.initialize(args);

			// 2. Konfiguracja adaptera
			// METODA 1 (polecana): Konfiguracja adaptera Adapter1 jest w pliku konfiguracyjnym podanym jako parametr uruchomienia serwera
			//Ice.ObjectAdapter adapter = communicator.createObjectAdapter("Adapter1");  
			
			// METODA 2 (niepolecana): Konfiguracja adaptera Adapter1 jest w kodzie Ÿród³owym
			Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("Adapter1", 
					"tcp -h localhost -p 10000:udp -h localhost -p 10000");

			// 3-4. Stworzenie serwanta/serwantów, dodanie wpisów do ASM, konfiguracja mechanizmów zarz¹dzania serwantami
			
			ServantLocator locator = new ServantLocator("temp", adapter);
			adapter.addServantLocator(locator, "k1");
			adapter.addServantLocator(locator, "k2");
			adapter.addServantLocator(locator, "k3");
			adapter.addServantLocator(locator, "k4");
			adapter.addServantLocator(locator, "k5");

            
           
            
           // ServantLocator = locator = new ServantLocator("k2");
//            Ice.ServantLocator mylocator = new ServantLocator1("A", servant3); //TODO, example only
//
//            adapter.add(servant2, new Identity("name", "category")); //TODO, example only
//                       
//            adapter.addServantLocator(mylocator, "category"); //TODO, example only
//            adapter.addDefaultServant(servant3, "category"); //TODO, example only
//			

            // 5. Aktywacja adaptera i przejœcie w pêtlê przetwarzania ¿¹dañ
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
			// Clean up
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

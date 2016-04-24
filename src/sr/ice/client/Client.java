// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package sr.ice.client;

import Demo.*;
import Ice.AsyncResult;

public class Client
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int status = 0;
		Ice.Communicator communicator = null;

		try {
			// 1. Inicjalizacja ICE
			communicator = Ice.Util.initialize(args);

			// 2. Uzyskanie referencji obiektu na podstawie linii w pliku konfiguracyjnym
			// Ice.ObjectPrx base = communicator.propertyToProxy("Calc1.Proxy");
			// 2. To samo co powy¿ej, ale mniej ³adnie
			Ice.ObjectPrx base = communicator.stringToProxy("k1/c333:tcp -h localhost -p 10000:udp -h localhost -p 10000:ssl -h localhost -p 10001");
			
			// 3. Rzutowanie, zawê¿anie

			CalcPrx calc = CalcPrxHelper.checkedCast(base);
			if (calc == null) throw new Error("Invalid proxy");
			
			


//			CalcPrx calc_oneway = (CalcPrx)calc.ice_oneway();
//			CalcPrx calc_batch_oneway = (CalcPrx)calc.ice_batchOneway();
//			CalcPrx calc_datagram = (CalcPrx)calc.ice_datagram();
//			CalcPrx calc_batch_datagram = (CalcPrx)calc.ice_batchDatagram();


			// 4. Wywolanie zdalnych operacji

			String line = null;
			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			
//			AsyncResult ar = null;
						
			do
			{
				try
				{
					System.out.print("==> ");
					System.out.flush();
					line = in.readLine();

					if (line == null)
					{
						break;
					}
					

					if (line.equals("add1"))
					{
						System.out.println(calc.add1(7, 8));	
					}
					else if (line.equals("x"))
					{
						
					}
				}
				catch (java.io.IOException ex)
				{
					System.err.println(ex);
				}
			}
			while (!line.equals("x"));


		} catch (Ice.LocalException e) {
			e.printStackTrace();
			status = 1;
		
		} catch (Exception e) {
			System.err.println(e.getMessage());
			status = 1;
		}
		if (communicator != null) {
			// Clean up
			//
			try {
				communicator.destroy();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				status = 1;
			}
		}
		System.exit(status);
	}

}
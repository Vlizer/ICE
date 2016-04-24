// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package sr.ice.impl;

import Demo.RequestCanceledException;
import Demo._CalcDisp;
import Ice.Current;


public class CalcI extends _CalcDisp
{

	private static final long serialVersionUID = -2448962912780867770L;
  
    private int val;

    public CalcI()
    {
        
    }

  

	
	@Override
	public float add1(float a, float b, Current __current) 
	{
       /*try
        {
            Thread.sleep(5000);
        }
        catch(java.lang.InterruptedException ex)
        {
        }*/
		System.out.println(__current.id.name);

		System.out.println("ADD: a = " + a + ", b = " + b + ", result = " + (a+b));
		
		return a + b;
	}

	
	



}

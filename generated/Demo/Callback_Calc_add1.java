// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `Demo.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public abstract class Callback_Calc_add1
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackFloat
{
    public final void __completed(Ice.AsyncResult __result)
    {
        CalcPrxHelper.__add1_completed(this, __result);
    }
}

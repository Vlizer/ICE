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

public interface CalcPrx extends Ice.ObjectPrx
{
    public float add1(float a, float b);

    public float add1(float a, float b, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_add1(float a, float b);

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_add1(float a, float b, Ice.Callback __cb);

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_add1(float a, float b, Callback_Calc_add1 __cb);

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx, Callback_Calc_add1 __cb);

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb);

    public float end_add1(Ice.AsyncResult __result);
}

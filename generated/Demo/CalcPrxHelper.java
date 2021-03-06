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

/**
 * Provides type-specific helper functions.
 **/
public final class CalcPrxHelper extends Ice.ObjectPrxHelperBase implements CalcPrx
{
    private static final String __add1_name = "add1";

    public float add1(float a, float b)
    {
        return add1(a, b, null, false);
    }

    public float add1(float a, float b, java.util.Map<String, String> __ctx)
    {
        return add1(a, b, __ctx, true);
    }

    private float add1(float a, float b, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__add1_name);
        return end_add1(begin_add1(a, b, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_add1(float a, float b)
    {
        return begin_add1(a, b, null, false, false, null);
    }

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx)
    {
        return begin_add1(a, b, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_add1(float a, float b, Ice.Callback __cb)
    {
        return begin_add1(a, b, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_add1(a, b, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_add1(float a, float b, Callback_Calc_add1 __cb)
    {
        return begin_add1(a, b, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_add1(float a, float b, java.util.Map<String, String> __ctx, Callback_Calc_add1 __cb)
    {
        return begin_add1(a, b, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_add1(a, b, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_add1(a, b, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_add1(a, b, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_add1(float a, 
                                      float b, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_FloatCallback __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_add1(a, b, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_add1(float a, 
                                       float b, 
                                       java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.Functional_FloatCallback __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_add1(a, b, __ctx, __explicitCtx, __synchronous, 
                          new IceInternal.Functional_TwowayCallbackFloat(__responseCb, __exceptionCb, __sentCb)
                              {
                                  public final void __completed(Ice.AsyncResult __result)
                                  {
                                      CalcPrxHelper.__add1_completed(this, __result);
                                  }
                              });
    }

    private Ice.AsyncResult begin_add1(float a, 
                                       float b, 
                                       java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__add1_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__add1_name, __cb);
        try
        {
            __result.prepare(__add1_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeFloat(a);
            __os.writeFloat(b);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public float end_add1(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __add1_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            float __ret;
            __ret = __is.readFloat();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __add1_completed(Ice.TwowayCallbackFloat __cb, Ice.AsyncResult __result)
    {
        Demo.CalcPrx __proxy = (Demo.CalcPrx)__result.getProxy();
        float __ret = (float)0.0;
        try
        {
            __ret = __proxy.end_add1(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CalcPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), CalcPrx.class, CalcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CalcPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), CalcPrx.class, CalcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CalcPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), CalcPrx.class, CalcPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static CalcPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), CalcPrx.class, CalcPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static CalcPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, CalcPrx.class, CalcPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static CalcPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, CalcPrx.class, CalcPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Demo::Calc",
        "::Ice::Object"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[0];
    }

    public static void __write(IceInternal.BasicStream __os, CalcPrx v)
    {
        __os.writeProxy(v);
    }

    public static CalcPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CalcPrxHelper result = new CalcPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}

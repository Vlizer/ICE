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
public final class UserManagementPrxHelper extends Ice.ObjectPrxHelperBase implements UserManagementPrx
{
    private static final String __createUser_name = "createUser";

    public UserPrx createUser()
    {
        return createUser(null, false);
    }

    public UserPrx createUser(java.util.Map<String, String> __ctx)
    {
        return createUser(__ctx, true);
    }

    private UserPrx createUser(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__createUser_name);
        return end_createUser(begin_createUser(__ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_createUser()
    {
        return begin_createUser(null, false, false, null);
    }

    public Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx)
    {
        return begin_createUser(__ctx, true, false, null);
    }

    public Ice.AsyncResult begin_createUser(Ice.Callback __cb)
    {
        return begin_createUser(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_createUser(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_createUser(Callback_UserManagement_createUser __cb)
    {
        return begin_createUser(null, false, false, __cb);
    }

    public Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, Callback_UserManagement_createUser __cb)
    {
        return begin_createUser(__ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_createUser(IceInternal.Functional_GenericCallback1<UserPrx> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_createUser(null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_createUser(IceInternal.Functional_GenericCallback1<UserPrx> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createUser(null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<UserPrx> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_createUser(__ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, 
                                            IceInternal.Functional_GenericCallback1<UserPrx> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createUser(__ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.Functional_GenericCallback1<UserPrx> __responseCb, 
                                             IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                             IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_createUser(__ctx, __explicitCtx, __synchronous, 
                                new IceInternal.Functional_TwowayCallbackArg1<Demo.UserPrx>(__responseCb, __exceptionCb, __sentCb)
                                    {
                                        public final void __completed(Ice.AsyncResult __result)
                                        {
                                            UserManagementPrxHelper.__createUser_completed(this, __result);
                                        }
                                    });
    }

    private Ice.AsyncResult begin_createUser(java.util.Map<String, String> __ctx, 
                                             boolean __explicitCtx, 
                                             boolean __synchronous, 
                                             IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__createUser_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__createUser_name, __cb);
        try
        {
            __result.prepare(__createUser_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            __result.writeEmptyParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public UserPrx end_createUser(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __createUser_name);
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
            UserPrx __ret;
            __ret = UserPrxHelper.__read(__is);
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

    static public void __createUser_completed(Ice.TwowayCallbackArg1<UserPrx> __cb, Ice.AsyncResult __result)
    {
        Demo.UserManagementPrx __proxy = (Demo.UserManagementPrx)__result.getProxy();
        UserPrx __ret = null;
        try
        {
            __ret = __proxy.end_createUser(__result);
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

    private static final String __findUsers_name = "findUsers";

    public UserPrx[] findUsers(String template)
    {
        return findUsers(template, null, false);
    }

    public UserPrx[] findUsers(String template, java.util.Map<String, String> __ctx)
    {
        return findUsers(template, __ctx, true);
    }

    private UserPrx[] findUsers(String template, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__findUsers_name);
        return end_findUsers(begin_findUsers(template, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_findUsers(String template)
    {
        return begin_findUsers(template, null, false, false, null);
    }

    public Ice.AsyncResult begin_findUsers(String template, java.util.Map<String, String> __ctx)
    {
        return begin_findUsers(template, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_findUsers(String template, Ice.Callback __cb)
    {
        return begin_findUsers(template, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findUsers(String template, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_findUsers(template, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findUsers(String template, Callback_UserManagement_findUsers __cb)
    {
        return begin_findUsers(template, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_findUsers(String template, java.util.Map<String, String> __ctx, Callback_UserManagement_findUsers __cb)
    {
        return begin_findUsers(template, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_findUsers(String template, 
                                           IceInternal.Functional_GenericCallback1<UserPrx[]> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findUsers(template, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findUsers(String template, 
                                           IceInternal.Functional_GenericCallback1<UserPrx[]> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findUsers(template, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_findUsers(String template, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_GenericCallback1<UserPrx[]> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_findUsers(template, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_findUsers(String template, 
                                           java.util.Map<String, String> __ctx, 
                                           IceInternal.Functional_GenericCallback1<UserPrx[]> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findUsers(template, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_findUsers(String template, 
                                            java.util.Map<String, String> __ctx, 
                                            boolean __explicitCtx, 
                                            boolean __synchronous, 
                                            IceInternal.Functional_GenericCallback1<UserPrx[]> __responseCb, 
                                            IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                            IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_findUsers(template, __ctx, __explicitCtx, __synchronous, 
                               new IceInternal.Functional_TwowayCallbackArg1<Demo.UserPrx[]>(__responseCb, __exceptionCb, __sentCb)
                                   {
                                       public final void __completed(Ice.AsyncResult __result)
                                       {
                                           UserManagementPrxHelper.__findUsers_completed(this, __result);
                                       }
                                   });
    }

    private Ice.AsyncResult begin_findUsers(String template, 
                                            java.util.Map<String, String> __ctx, 
                                            boolean __explicitCtx, 
                                            boolean __synchronous, 
                                            IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__findUsers_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__findUsers_name, __cb);
        try
        {
            __result.prepare(__findUsers_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(template);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public UserPrx[] end_findUsers(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __findUsers_name);
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
            UserPrx[] __ret;
            __ret = UsersHelper.read(__is);
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

    static public void __findUsers_completed(Ice.TwowayCallbackArg1<UserPrx[]> __cb, Ice.AsyncResult __result)
    {
        Demo.UserManagementPrx __proxy = (Demo.UserManagementPrx)__result.getProxy();
        UserPrx[] __ret = null;
        try
        {
            __ret = __proxy.end_findUsers(__result);
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
    public static UserManagementPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserManagementPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserManagementPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static UserManagementPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static UserManagementPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static UserManagementPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, UserManagementPrx.class, UserManagementPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Demo::UserManagement",
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

    public static void __write(IceInternal.BasicStream __os, UserManagementPrx v)
    {
        __os.writeProxy(v);
    }

    public static UserManagementPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            UserManagementPrxHelper result = new UserManagementPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
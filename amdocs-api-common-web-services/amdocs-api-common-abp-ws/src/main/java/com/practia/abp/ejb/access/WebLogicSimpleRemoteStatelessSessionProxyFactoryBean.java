package com.practia.abp.ejb.access;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.Properties;
import javax.ejb.EJBObject;
import javax.naming.Context;
import javax.naming.NamingException;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.springframework.jndi.JndiCallback;
import com.practia.asm.core.connection.services.ConnectionServices;
import com.practia.asm.core.user.context.ContextRoot;
import amdocs.ar.general.error.ApplicationException;
import amdocs.ar.general.error.ValidationException;
import amdocs.uams.exceptions.ASM3WSException;

/**
 * The Spring classes do not seem to execute the create, invoke, and remove
 * methods inside the scope of an InitialContext, which is unfortunately
 * required by WebLogic to properly pass authentication information. This class
 * overrides the normal create, invoke, and remove methods to run inside the
 * scope of an initial context.
 */

public class WebLogicSimpleRemoteStatelessSessionProxyFactoryBean extends SimpleRemoteStatelessSessionProxyFactoryBean {

	private ConnectionServices connectionServices;
	private static Logger logger = LogManager.getLogger();

	protected Object create() throws NamingException, InvocationTargetException {
		try {
			return getJndiTemplate().execute(new JndiCallback() {
				public Object doInContext(Context context) throws NamingException {
					try {
						return WebLogicSimpleRemoteStatelessSessionProxyFactoryBean.super.create();
					} catch (InvocationTargetException ite) {
						throw new RuntimeException(ite.getCause());
					}
				}
			});

		} catch (RuntimeException re) {
			throw (InvocationTargetException) re.getCause();
		}
	}

	protected void removeSessionBeanInstance(final EJBObject ejbObject) {
		try {
			getJndiTemplate().execute(new JndiCallback() {
				public Object doInContext(Context context) throws NamingException {
					WebLogicSimpleRemoteStatelessSessionProxyFactoryBean.super.removeSessionBeanInstance(ejbObject);
					return null;
				}
			});

		} catch (NamingException e) {
			throw new RuntimeException(e.getCause());
		}
	}

	protected Object doInvoke(final MethodInvocation methodInvocation) throws Throwable {
		// before to invoke must be set the Environment with ASM3 ticket
		beforeToInvoke();
		try {
			logger.info(String.format("%s - Calling Business Inteface :%s - executing :%s at %s.",
					ContextRoot.ABP.value(),
					WebLogicSimpleRemoteStatelessSessionProxyFactoryBean.super.getBusinessInterface().getCanonicalName(),
					methodInvocation.getMethod().getName(),
					DateTime.now()));
			return getJndiTemplate().execute(new JndiCallback() {
				public Object doInContext(Context context) throws NamingException {
					try {
						return WebLogicSimpleRemoteStatelessSessionProxyFactoryBean.super.doInvoke(methodInvocation);
					} catch (Throwable t) {
						if (t instanceof NamingException) {
							throw (NamingException) t;
						} 
						RuntimeException re = new RuntimeException(t);
						re.setStackTrace(t.getStackTrace());
						throw re;
					}
				}
			});
		} catch (RuntimeException re) {
			logger.error(String.format("Exception calling %s, siganture : %s",
					WebLogicSimpleRemoteStatelessSessionProxyFactoryBean.super.getBusinessInterface()
							.getCanonicalName(),
					methodInvocation.getMethod().getName()), re);
			throw re.getCause();
		}

	}
	private void beforeToInvoke() throws RemoteException, ASM3WSException {
		if(super.getJndiTemplate().getEnvironment() == null)
			super.getJndiTemplate().setEnvironment(new Properties());
		getConnectionServices().getEnviroment(super.getJndiTemplate().getEnvironment());
	}

	public ConnectionServices getConnectionServices() {
		return connectionServices;
	}

	public void setConnectionServices(ConnectionServices connectionServices) {
		this.connectionServices = connectionServices;
	}
}

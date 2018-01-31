package com.practia.abp.ejb.access;

import java.lang.reflect.InvocationTargetException;

import javax.ejb.EJBObject;
import javax.naming.Context;
import javax.naming.NamingException;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean;
import org.springframework.jndi.JndiCallback;

public class ASM3RemoteStatelessSessionProxyFactoryBean extends SimpleRemoteStatelessSessionProxyFactoryBean {
	protected Object create() throws NamingException, InvocationTargetException {
		try {
			return getJndiTemplate().execute(new JndiCallback() {
				public Object doInContext(Context context) throws NamingException {
					try {
						return ASM3RemoteStatelessSessionProxyFactoryBean.super.create();
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
					ASM3RemoteStatelessSessionProxyFactoryBean.super.removeSessionBeanInstance(ejbObject);
					return null;
				}
			});

		} catch (NamingException e) {
			throw new RuntimeException(e.getCause());
		}
	}

	protected Object doInvoke(final MethodInvocation methodInvocation) throws Throwable {
		try {
			return getJndiTemplate().execute(new JndiCallback() {
				public Object doInContext(Context context) throws NamingException {
					try {
						return ASM3RemoteStatelessSessionProxyFactoryBean.super.doInvoke(methodInvocation);
					} catch (Throwable t) {
						if (t instanceof NamingException) {
							throw (NamingException) t;
						} else {
							throw new RuntimeException(t.getLocalizedMessage(), t.getCause());
						}
					}
				}
			});
		} catch (RuntimeException re) {
			throw re;
		}

	}

}

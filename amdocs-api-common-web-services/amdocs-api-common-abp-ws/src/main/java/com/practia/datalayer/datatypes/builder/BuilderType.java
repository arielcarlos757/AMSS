package com.practia.datalayer.datatypes.builder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.practia.datalayer.datatypes.processors.Processor;
import com.practia.datalayer.datatypes.processors.impl.AccountBalanceDtProcessor;

import amdocs.acmarch.core.AbstractDatatype;
import amdocs.ar.datalayer.datatypes.AccountBalanceDt;

public class BuilderType<T> {

	private Map<Class<?>, Processor<?>> processors;

	public BuilderType() {
		this.processors = new ConcurrentHashMap<Class<?>, Processor<?>>();
		processors.put(AccountBalanceDt.class, new AccountBalanceDtProcessor());
	}

	public Builder<?> builderOf(AbstractDatatype dataType) {
		Processor<?> p = processors.get(dataType.getClass());
		if (p == null)
			throw new IllegalArgumentException(
					"No processor registered with name: " + dataType.getClass().getCanonicalName());
		return p.process(dataType);
	}
}

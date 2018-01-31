package com.practia.datalayer.datatypes.processors;

import com.practia.datalayer.datatypes.builder.Builder;

import amdocs.acmarch.core.AbstractDatatype;

public interface Processor<T> {

	public Builder<T> process(AbstractDatatype dt);
}

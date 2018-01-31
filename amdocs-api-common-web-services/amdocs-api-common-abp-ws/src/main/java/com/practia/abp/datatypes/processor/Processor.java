package com.practia.abp.datatypes.processor;

import com.practia.abp.datatypes.AbstractBeantype;
import amdocs.acmarch.core.AbstractDatatype;

public interface Processor {

	public <T extends AbstractBeantype> T process(AbstractDatatype dt);
}

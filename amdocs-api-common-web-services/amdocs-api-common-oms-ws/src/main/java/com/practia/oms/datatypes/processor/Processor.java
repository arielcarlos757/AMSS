package com.practia.oms.datatypes.processor;

import com.amdocs.datatypes.DataType;
import com.practia.oms.datatypes.type.AbstractBeantype;

public interface Processor {
	public <T extends AbstractBeantype> T process(DataType dt);
}

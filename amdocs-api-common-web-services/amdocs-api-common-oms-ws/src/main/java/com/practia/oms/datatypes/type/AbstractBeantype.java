package com.practia.oms.datatypes.type;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBeantype")
public abstract class AbstractBeantype implements Serializable {
	private static final long serialVersionUID = 1L;

}

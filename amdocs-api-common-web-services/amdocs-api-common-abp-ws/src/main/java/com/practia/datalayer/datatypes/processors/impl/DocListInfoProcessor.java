package com.practia.datalayer.datatypes.processors.impl;

import com.practia.bl3g.datatypes.DocListInfoBean;
import com.practia.datalayer.datatypes.builder.Builder;
import com.practia.datalayer.datatypes.processors.Processor;
import amdocs.bl3g.datatypes.DocListInfo;
import amdocs.acmarch.core.AbstractDatatype;

public class DocListInfoProcessor implements Processor<DocListInfoBean> {

	public Builder<DocListInfoBean> process(AbstractDatatype dt) {
		DocListInfo dataType = (DocListInfo)dt;
		return new DocListInfoBean
				.Builder()
					.paginationInfo(dataType.getPaginationInfo())
					.docList(dataType.getDocList());
	}
}


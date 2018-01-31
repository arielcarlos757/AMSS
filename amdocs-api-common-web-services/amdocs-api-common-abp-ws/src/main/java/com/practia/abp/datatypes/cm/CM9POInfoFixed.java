package com.practia.abp.datatypes.cm;

import amdocs.csm3g.datatypes.CM9POInfo;

public class CM9POInfoFixed {

	public static CM9POInfo convert(Object obj) throws Exception {
		
		if(obj == null){
			throw new RuntimeException("NullPointerException : Error while trying to get CM9POInfo from AMDOCS.");
		}
		
		if(obj instanceof String){
			throw new RuntimeException((String) obj);
		}
		
		if(!(obj instanceof CM9POInfo)) {
			throw new RuntimeException("Error while trying to get CM9POInfo from AMDOCS. Class :"  + 
					obj.getClass().getCanonicalName());
		}
		return (CM9POInfo)obj;
	}
}

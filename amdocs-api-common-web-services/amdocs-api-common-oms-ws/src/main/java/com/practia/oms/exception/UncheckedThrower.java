package com.practia.oms.exception;

public class UncheckedThrower {
	 public static <R> R trhow(Throwable t) {
		    return UncheckedThrower.<RuntimeException, R>trhow0(t);
		  }
		  @SuppressWarnings("unchecked")
		  private static <E extends Throwable, R> R trhow0(Throwable t) throws E { 
		    throw (E)t; 
		  }
}

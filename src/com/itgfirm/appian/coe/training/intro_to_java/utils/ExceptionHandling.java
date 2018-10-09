package com.itgfirm.appian.coe.training.intro_to_java.utils;

import org.apache.log4j.Logger;

public class ExceptionHandling {
	private static final Logger LOG = Logger.getLogger(ExceptionHandling.class);
	private final EnumExceptions ex;

	public ExceptionHandling(final EnumExceptions ex) {
		this.ex = ex;
	}

	public void handle(final Logger log, final Exception e) {
		switch (ex) {
		case CLASS_CAST:
			ex.handle(log, e);
			break;
		case FILE_NOT_FOUND:
			ex.handle(log, e);
			break;
		case IDX_OUT_BOUNDS:
			ex.handle(log, e);
			break;
		case ILL_ARG:
			ex.handle(log, e);
			break;
		case ILL_STATE:
			ex.handle(log, e);
			break;
		case IO:
			ex.handle(log, e);
			break;
		case NULL_POINT:
			ex.handle(log, e);
			break;
		case UNKNOWN:
			ex.handle(log, e);
			break;
		default:
			LOG.error("The exception handler was called, but, the exception is not listed!");
		}
	}
}
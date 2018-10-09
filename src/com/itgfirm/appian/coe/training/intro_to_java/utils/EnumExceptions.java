package com.itgfirm.appian.coe.training.intro_to_java.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.Logger;

public enum EnumExceptions {
	CLASS_CAST(ClassCastException.class), FILE_NOT_FOUND(FileNotFoundException.class),
	IDX_OUT_BOUNDS(IndexOutOfBoundsException.class), ILL_ARG(IllegalArgumentException.class),
	ILL_STATE(IllegalStateException.class), IO(IOException.class), NULL_POINT(NullPointerException.class),
	UNKNOWN(Exception.class);

	private Class<? extends Exception> clazz;

	EnumExceptions(final Class<? extends Exception> clazz) {
		this.clazz = clazz;
	}

	void handle(final Logger log, final Exception e) {
		final String name = clazz.getSimpleName();
		final EnumClass value = EnumClass.valueOf(EnumClass.class, name);
		switch (value) {
		case CLASS_CAST:
			EnumMessages.CLASS_CAST.handle(log, e);
			break;
		case FILE_NOT_FOUND:
			EnumMessages.FILE_NOT_FOUND.handle(log, e);
			break;
		case IDX_OUT_BOUNDS:
			EnumMessages.IDX_OUT_BOUNDS.handle(log, e);
			break;
		case ILL_ARG:
			EnumMessages.ILL_ARG.handle(log, e);
			break;
		case ILL_STATE:
			EnumMessages.ILL_STATE.handle(log, e);
			break;
		case IO:
			EnumMessages.IO.handle(log, e);
			break;
		case NULL_POINT:
			EnumMessages.NULL_POINT.handle(log, e);
			break;
		default:
			EnumMessages.UNKNOWN.handle(log, e);
			break;

		}
	}

	enum EnumClass {
		CLASS_CAST(ClassCastException.class.getSimpleName()),
		FILE_NOT_FOUND(FileNotFoundException.class.getSimpleName()),
		IDX_OUT_BOUNDS(IndexOutOfBoundsException.class.getSimpleName()),
		ILL_ARG(IllegalArgumentException.class.getSimpleName()), ILL_STATE(IllegalStateException.class.getSimpleName()),
		IO(IOException.class.getSimpleName()), NULL_POINT(NullPointerException.class.getSimpleName());

		private String className;

		EnumClass(final String msg) {
			this.className = msg;
		}

		String getValue() {
			return className;
		}
	}

	enum EnumMessages {
		CLASS_CAST("The object you are trying to cast cannot be cast into the provided class!"),
		FILE_NOT_FOUND("The file for the specified path or provided File object does not exist!"),
		IDX_OUT_BOUNDS("The provided array index is out of bounds!"),
		ILL_ARG("A null, empty or invalid value was provided!"),
		ILL_STATE("The object attempted to be used is in a incorrect state!"),
		IO("There was a problem with the input/output resource"),
		NULL_POINT("The object provided is null and does not exist!aF"), UNKNOWN("An exception was thrown!");

		private String msg;

		EnumMessages(final String msg) {
			this.msg = msg;
		}

		void handle(final Logger log, final Exception e) {
			log.error(msg, e);
		}
	}
}

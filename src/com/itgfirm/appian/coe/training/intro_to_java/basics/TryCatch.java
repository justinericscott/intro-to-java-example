package com.itgfirm.appian.coe.training.intro_to_java.basics;

import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.itgfirm.appian.coe.training.intro_to_java.utils.EnumExceptions;
import com.itgfirm.appian.coe.training.intro_to_java.utils.ExceptionHandling;

public class TryCatch {
	private static final Logger LOG = Logger.getLogger(TryCatch.class);

	public void tryCatchStatement() throws IOException {
		try {
			final FileReader read = new FileReader("");
			// Should throw exception
			read.close();
		} catch (final IOException e) {
			new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
			throw e;
		}
	}
	
	public void tryCatchFinallyStatement() throws IOException {
		FileReader read = null;
		try {
			read = new FileReader("");
			// Should throw exception
		} catch (final IOException e) {
			new ExceptionHandling(EnumExceptions.FILE_NOT_FOUND).handle(LOG, e);
			throw e;
		} finally {
			try {
				read.close();
			} catch (final IOException e) {
				new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
				throw e;
			}
		}
	}
	
	public void tryCatchWithStatement() throws IOException {
		try (final FileReader read = new FileReader("")) {
			// Should throw exception
		} catch (final IOException e) {
			throw e;
		}
	}
}
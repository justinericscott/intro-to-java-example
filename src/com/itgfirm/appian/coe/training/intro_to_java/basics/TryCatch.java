package com.itgfirm.appian.coe.training.intro_to_java.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.log4j.Logger;

import com.itgfirm.appian.coe.training.intro_to_java.utils.EnumExceptions;
import com.itgfirm.appian.coe.training.intro_to_java.utils.ExceptionHandling;

public class TryCatch {
	private static final Logger LOG = Logger.getLogger(TryCatch.class);

	public void tryCatchStatement() {
		try {
			final FileReader read = new FileReader("");
			// Should throw exception
			read.close();
		} catch (final IOException e) {
			new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
		}
		try {
			final FileWriter write = new FileWriter("");
			// Should throw exception
			write.close();
		} catch (final IOException e) {
			new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
		}
	}
	
	public void tryCatchFinallyStatement() {
		FileReader read = null;
		try {
			read = new FileReader("");
			// Should throw exception
		} catch (final FileNotFoundException e) {
			new ExceptionHandling(EnumExceptions.FILE_NOT_FOUND).handle(LOG, e);
		} finally {
			try {
				read.close();
			} catch (final IOException e) {
				new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
			}
		}
		FileWriter write = null;
		try {
			write = new FileWriter("");
			// Should throw exception
		} catch (final IOException e) {
			new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
		} finally {
			try {
				write.close();
			} catch (final IOException e) {
				new ExceptionHandling(EnumExceptions.IO).handle(LOG, e);
			}
		}
	}
	
	public void tryCatchWithStatement() {
		try (final FileReader read = new FileReader("")) {
			// Should throw exception
		} catch (final IOException e) {
			LOG.error(e.getMessage(), e);
		}
		try (final FileWriter write = new FileWriter("")) {
			// Should throw exception			
		} catch (final IOException e) {
			LOG.error(e.getMessage(), e);
		}
	}
}
package com.itgfirm.appian.coe.training.intro_to_java.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import com.itgfirm.appian.coe.training.intro_to_java.basics.TryCatch;

class TryCatchTest {
	
	@Test
	public void tryCatchStatementTest() throws IOException {
		assertThrows(IllegalArgumentException.class, () -> {
			final TryCatch tc = new TryCatch();
			tc.tryCatchStatement();			
		});
	}
	
	@Test 
	public void tryCatchFinallyStatementTest() throws IOException {
		assertThrows(NullPointerException.class, () -> {
			final TryCatch tc = new TryCatch();
			tc.tryCatchFinallyStatement();			
		});
	}
	
	@Test
	public void tryCatchWithStatementTest() throws IOException {
		assertThrows(FileNotFoundException.class, () -> {
			final TryCatch tc = new TryCatch();
			tc.tryCatchWithStatement();
			
		});
	}
}
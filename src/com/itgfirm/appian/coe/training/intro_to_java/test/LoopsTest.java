package com.itgfirm.appian.coe.training.intro_to_java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.itgfirm.appian.coe.training.intro_to_java.basics.Loops;

public class LoopsTest {
	
	@Test
	public void forLoopTest() {
		final Loops loops = new Loops();
		final Integer val = loops.forLoop();
		assertNotNull(val);
		assertEquals(new Integer(1), val);
	}
	
	@Test
	public void forEnhancedLoopTest() {
		final Loops loops = new Loops();
		final Integer val = loops.forEnhancedLoop();
		assertNotNull(val);
		assertEquals(new Integer(1), val);
	}
	
	@Test
	public void forEachLoopTest() {
		final Loops loops = new Loops();
		final Integer val = loops.forEachLoop();
		assertNotNull(val);
		assertEquals(new Integer(1), val);
	}
	
	@Test
	public void whileLoopTest() {
		final Loops loops = new Loops();
		final Integer val = loops.whileLoop();
		assertNotNull(val);
		assertEquals(new Integer(1), val);
	}
	
	@Test
	public void doWhileLoopTest() {
		final Loops loops = new Loops();
		final Integer val = loops.doWhileLoop();
		assertNotNull(val);
		assertEquals(new Integer(1), val);
	}
}
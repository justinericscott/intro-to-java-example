package com.itgfirm.appian.coe.training.intro_to_java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.itgfirm.appian.coe.training.intro_to_java.basics.Conditions;

public class ConditionsTest {
	
	@Test
	public void ifStatementTest() {
		final Conditions cons = new Conditions();
		assertEquals(new Integer(5), cons.ifStatement());
	}
	
	@Test
	public void ifElseStatementTest() {
		final Conditions cons = new Conditions();
		assertEquals(new Integer(5), cons.ifElseStatement());
	}
	
	@Test
	public void ifElseIfStatementTest() {
		final Conditions cons = new Conditions();
		assertEquals(new Integer(5), cons.ifElseIfStatement());
	}
	
	@Test
	public void nestedIfStatementTest() {
		final Conditions cons = new Conditions();
		assertEquals(new Integer(5), cons.nestedIfStatement());
	}
	
	@Test
	public void switchStatementTest() {
		final Conditions cons = new Conditions();
		assertEquals(new Integer(5), cons.switchStatement());
	}
}
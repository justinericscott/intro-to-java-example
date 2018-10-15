package com.itgfirm.appian.coe.training.intro_to_java.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itgfirm.appian.coe.training.intro_to_java.basics.DatatypesArraysLists;

class DatatypesArraysListsTest {

	@Test
	void test() {
		final DatatypesArraysLists obj = new DatatypesArraysLists();
		assertEquals(DatatypesArraysLists.COMPLETED, obj.getObjString());
	}


}

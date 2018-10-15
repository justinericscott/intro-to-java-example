package com.itgfirm.appian.coe.training.intro_to_java.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class Loops {
	private static final Logger LOG = Logger.getLogger(Loops.class);
	private final List<Integer> list = new ArrayList<Integer>();
	
	public Loops() {
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
	}

	public Integer forLoop() {
		Integer val = null;
		for (int i = 0; list.size() > i; i++) {
			val = list.get(i);
			LOG.info("INDEX: " + i + " | VALUE: " + val);
		}
		return val;
	}

	public Integer forEnhancedLoop() {
		Integer val = null;
		int i = 0;
		for (final Integer num : list) {
			val = num;
			LOG.info("INDEX: " + i + " | VALUE: " + num);
			i++;
		}
		return val;
	}
	
	public Integer forEachLoop() {
		list.forEach(num -> {
			LOG.info("INDEX: UNKNOWN | VALUE: " + num);
		});
		return 1;
	}
	
	public Integer whileLoop() {
		Integer val = null;
		final Iterator<Integer> iter = list.iterator();
		int i = 0;
		while (iter.hasNext()) {
			val = iter.next(); 
			LOG.info("INDEX: " + i + " | VALUE: " + val);
			i++;			
		}
		return val;
	}
	
	public Integer doWhileLoop() {
		Integer val = null;
		final Iterator<Integer> iter = list.iterator();
		boolean flag = true;
		int i = 0;
		do {
			if (iter.hasNext()) {
				val = iter.next();
				LOG.info("INDEX: " + i + " | VALUE: " + val);
				i++;
			} else {
				flag = false;
			}
		} while (flag);
		return val;
	}
}
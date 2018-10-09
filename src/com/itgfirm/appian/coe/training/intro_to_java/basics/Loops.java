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

	public void forLoop() {
		for (int i = 0; list.size() < i; i++) {
			LOG.info("INDEX: " + i + " | VALUE: " + list.get(i));
		}
	}

	public void forEnhancedLoop() {
		int i = 0;
		for (final Integer num : list) {
			LOG.info("INDEX: " + i + " | VALUE: " + num);
			i++;
		}
	}
	
	public void forEachLoop() {
		list.forEach(num -> {
			LOG.info("INDEX: UNKNOWN | VALUE: " + num);
		});
	}
	
	public void whileLoop() {
		final Iterator<Integer> iter = list.iterator();
		int i = 0;
		while (iter.hasNext()) {
			final Integer num = iter.next(); 
			LOG.info("INDEX: " + i + " | VALUE: " + num);
			i++;			
		}
	}
	
	public void doWhileLoop() {
		final Iterator<Integer> iter = list.iterator();
		boolean flag = true;
		int i = 0;
		do {
			if (iter.hasNext()) {
				Integer num = iter.next();
				LOG.info("INDEX: " + i + " | VALUE: " + num);
				i++;
			} else {
				flag = false;
			}
		} while (flag);
	}
}
package com.itgfirm.appian.coe.training.intro_to_java.basics;

import org.apache.log4j.Logger;

public class Conditions {
	private static final Logger LOG = Logger.getLogger(Conditions.class);

	public Integer ifStatement() {
		final Integer[] array = { 1, 2, 3, 4, 5 };
		if (array.length == 5) {
			final Integer num = array[4];
			LOG.info("The last array item is " + num);
			return num;
		}
		return null;
	}

	public Integer ifElseStatement() {
		final Integer[] array = { 1, 2, 3, 4, 5 };
		if (array.length > 5) {
			// Won't do anything
		} else {
			final Integer num = array[4];
			LOG.info("The last array item is " + num);
			return num;
		}
		return null;
	}

	public Integer ifElseIfStatement() {
		final Integer[] array = { 1, 2, 3, 4, 5 };
		if (array.length > 5) {
			// Won't do anything
		} else if (array.length < 1) {
			// Won't do anything
		} else {
			final Integer num = array[4];
			LOG.info("The last array item is " + num);
			return num;
		}
		return null;
	}

	public Integer nestedIfStatement() {
		final Integer[] array = { 1, 2, 3, 4, 5 };
		if (array.length > 1) {
			if (array.length > 2) {
				if (array.length > 3) {
					if (array.length > 4) {
						if (array.length == 5) {
							final Integer num = array[4];
							LOG.info("The last array item is " + num);
							return num;
						}
					}
				}
			}
		}
		return null;
	}

	public Integer switchStatement() {
		final int num = 5;
		switch (num) {
		case 1:
			LOG.info("The number is " + num);
			break;
		case 2:
			LOG.info("The number is " + num);
			break;
		case 3:
			LOG.info("The number is " + num);
			break;
		case 4:
			LOG.info("The number is " + num);
			break;
		case 5:
			LOG.info("The number is " + num);
			return num;
		default:
			LOG.info("The number is unknown");
			break;
		}
		return null;
	}
}
package com.itgfirm.appian.coe.training.intro_to_java.utils;

import java.util.Collection;

public class StaticMethodsClass {
	
	public static boolean isNotNullOrEmpty(final Object obj) {
		return (obj != null && !obj.toString().isEmpty());
	}

	public static boolean isNotNullOrEmpty(final Collection<?> collection) {
		return (collection != null && !collection.isEmpty());
	}

	public static boolean isNotNullOrZero(final Long num) {
		return (num != null && num > 0L);
	}
	
	public static boolean isNotNullOrZero(final Integer num) {
		return (num != null && num > 0);
	}	
}
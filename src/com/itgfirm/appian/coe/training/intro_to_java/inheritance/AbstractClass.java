package com.itgfirm.appian.coe.training.intro_to_java.inheritance;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

import com.itgfirm.appian.coe.training.intro_to_java.utils.EnumExceptions;
import com.itgfirm.appian.coe.training.intro_to_java.utils.ExceptionHandling;
import com.itgfirm.appian.coe.training.intro_to_java.utils.StaticMethodsClass;

abstract class AbstractClass {
	private static final Logger LOG = Logger.getLogger(AbstractClass.class);
	private final Map<Long, String> data = new HashMap<Long, String>();

	public final void addData(final String data) {
		if (StaticMethodsClass.isNotNullOrEmpty(data)) {
			if (this.data.containsValue(data)) {
				final Set<Entry<Long, String>> entries = this.data.entrySet();
				final Iterator<Entry<Long, String>> iter = entries.iterator();
				while (iter.hasNext()) {
					final Entry<Long, String> entry = iter.next();
					if (entry.getValue().equals(data)) {
						this.data.replace(entry.getKey(), data);
					}
				}
			} else {
				final Integer size = this.data.size();
				final Long[] keys = this.data.keySet().toArray(new Long[size.intValue()]);
				final Long last = keys[size - 1];
				addData(last + 1, data);
			}
		} else {
			new ExceptionHandling(EnumExceptions.ILL_ARG).handle(LOG, new IllegalArgumentException("The data provided was null!"));
		}
	}

	public final void addData(final Long key, final String data) {
		if (StaticMethodsClass.isNotNullOrZero(key)) {
			if (StaticMethodsClass.isNotNullOrEmpty(data)) {
				this.data.put(key, data);
			} else {
				new ExceptionHandling(EnumExceptions.ILL_ARG).handle(LOG, new IllegalArgumentException("The data provided was null!"));
			}
		} else {
			new ExceptionHandling(EnumExceptions.ILL_ARG).handle(LOG, new IllegalArgumentException("The ID provided was null or zero!"));
		}
	}

	public final void addData(final Collection<String> data) {
		try {
			data.forEach(d -> {
				addData(d);
			});
		} catch (final Exception e) {
			new ExceptionHandling(EnumExceptions.UNKNOWN).handle(LOG, e);
		}
	}
	
	public final void clear() {
		this.data.clear();
	}

	public final Collection<String> getData() {
		return data.values();
	}

	public final String getData(final Long id) {
		if (StaticMethodsClass.isNotNullOrZero(id)) {
			return this.data.get(id);
		} else {
			new ExceptionHandling(EnumExceptions.ILL_ARG).handle(LOG, new IllegalArgumentException("The ID provided was null or zero!"));
		}
		return null;
	}
}
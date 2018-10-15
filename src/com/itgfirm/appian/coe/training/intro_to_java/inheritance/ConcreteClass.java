package com.itgfirm.appian.coe.training.intro_to_java.inheritance;

import org.apache.log4j.Logger;

class ConcreteClass extends AbstractClass implements InterfaceClass {
	private static final Logger LOG = Logger.getLogger(ConcreteClass.class);
	
	@Override
	public final void print(final Long id) {
		print(getData(id));		
	}
	
	@Override
	public final void print(final String data) {
		LOG.info(data.toString());
	}
	
	@Override
	public final void print() {
		getData().forEach(d -> {
			print(d);
		});
	}
}
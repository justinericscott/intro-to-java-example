package com.itgfirm.appian.coe.training.intro_to_java.services;

import java.util.Collection;

public interface InterfaceClass {

	void addData(String data);
	
	void addData(Long key, String data);

	void addData(Collection<String> data);
	
	void clear();
	
	Collection<String> getData();
	
	String getData(Long id);
	
	void print(Long id);
	
	void print(String data);
	
	void print();
}
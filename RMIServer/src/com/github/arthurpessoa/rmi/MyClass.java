package com.github.arthurpessoa.rmi;

import java.io.Serializable;

/**
 * 
 * @author arsouza
 *
 */
class MyClass implements Serializable {
	private int value;
	public MyClass(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
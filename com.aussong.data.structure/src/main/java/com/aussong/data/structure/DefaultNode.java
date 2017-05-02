package com.aussong.data.structure;

public class DefaultNode<T extends Comparable<T>> implements Node<T>  {
	protected T value;
	
	public DefaultNode() {
	}
	
	public DefaultNode(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}

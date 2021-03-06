package com.aussong.data.structure;

public interface Node<T extends Comparable<T>> {
	public T getValue();
	public void setValue(T value) ;
}
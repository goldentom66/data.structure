package com.aussong.data.structure.stack;

import com.aussong.data.structure.Node;

public class StackNode<T extends Comparable<T>> {
	protected Node<T> node;
	protected int index;
	protected int min;
	
	public Node<T> getNode() {
		return node;
	}
	public void setNode(Node<T> node) {
		this.node = node;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
}

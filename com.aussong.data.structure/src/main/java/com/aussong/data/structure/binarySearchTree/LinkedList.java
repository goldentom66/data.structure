package com.aussong.data.structure.binarySearchTree;

public class LinkedList<T extends Comparable<T>> {
	private LinkedNode<T> start;
	
	public LinkedNode<T> getStart() {
		return start;
	}

	public void setStart(LinkedNode<T> start) {
		this.start = start;
	}
}

package com.aussong.data.structure.binarySearchTree;

public class LinkedList<T extends Comparable<T>> {
	private LinkedListNode<T> start;
	
	public LinkedListNode<T> getStart() {
		return start;
	}

	public void setStart(LinkedListNode<T> start) {
		this.start = start;
	}
}

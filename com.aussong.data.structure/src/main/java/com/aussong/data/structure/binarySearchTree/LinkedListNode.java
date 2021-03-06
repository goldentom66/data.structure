package com.aussong.data.structure.binarySearchTree;

import com.aussong.data.structure.Node;

public interface LinkedListNode<T extends Comparable<T>> extends Node<T> {

	public LinkedListNode<T> getNext();
	public void setNext(LinkedListNode<T> next);
	
	public LinkedListNode<T> getPrev();
	public void setPrev(LinkedListNode<T> prev);

}
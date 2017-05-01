package com.aussong.data.structure.binarySearchTree;

public interface LinkedNode<T extends Comparable<T>> extends Node<T> {

	public LinkedNode<T> getNext();
	public void setNext(LinkedNode<T> next);
	
	public LinkedNode<T> getPrev();
	public void setPrev(LinkedNode<T> prev);

}
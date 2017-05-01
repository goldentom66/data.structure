package com.aussong.data.structure.binarySearchTree;

public class LinkedBinarySearchTreeNode<T extends Comparable<T>> extends BinarySearchTreeNode<T> implements LinkedListNode<T> {
	protected LinkedListNode<T> prev;
	protected LinkedListNode<T> next;
	protected BinarySearchTreeNode<T> node;
	

	public LinkedBinarySearchTreeNode(BinarySearchTreeNode<T> node) {
		this.node = node;
	}

	public LinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}

	public LinkedListNode<T> getPrev() {
		return prev;
	}

	public void setPrev(LinkedListNode<T> prev) {
		this.prev = prev;
	}

	@Override
	public T getValue() {
		return node.getValue();
	}

	@Override
	public void setValue(T value) {
		node.setValue(value);
	}

	@Override
	public BinarySearchTree<T> getLeft() {
		return node.getLeft();
	}

	@Override
	public void setLeft(BinarySearchTree<T> left) {
		node.setLeft(left);
	}

	@Override
	public BinarySearchTree<T> getRight() {
		return node.getRight();
	}

	@Override
	public void setRight(BinarySearchTree<T> right) {
		node.setRight(right);
	}

}
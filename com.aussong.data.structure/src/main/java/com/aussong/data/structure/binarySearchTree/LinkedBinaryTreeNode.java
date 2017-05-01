package com.aussong.data.structure.binarySearchTree;

public class LinkedBinaryTreeNode<T extends Comparable<T>> extends BinaryTreeNode<T> implements LinkedNode<T> {
	protected LinkedNode<T> prev;
	protected LinkedNode<T> next;
	protected BinaryTreeNode<T> node;
	

	public LinkedBinaryTreeNode(BinaryTreeNode<T> node) {
		this.node = node;
	}

	public LinkedNode<T> getNext() {
		return next;
	}

	public void setNext(LinkedNode<T> next) {
		this.next = next;
	}

	public LinkedNode<T> getPrev() {
		return prev;
	}

	public void setPrev(LinkedNode<T> prev) {
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
	public BinaryTree<T> getLeft() {
		return node.getLeft();
	}

	@Override
	public void setLeft(BinaryTree<T> left) {
		node.setLeft(left);
	}

	@Override
	public BinaryTree<T> getRight() {
		return node.getRight();
	}

	@Override
	public void setRight(BinaryTree<T> right) {
		node.setRight(right);
	}

}
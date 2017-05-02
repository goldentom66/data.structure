package com.aussong.data.structure.binarySearchTree;

import com.aussong.data.structure.DefaultNode;

public class BinarySearchTreeNode<T extends Comparable<T>> extends DefaultNode<T> {
	protected BinarySearchTree<T> left;
	protected BinarySearchTree<T> right;
	
	public BinarySearchTreeNode() {
		super();
	}
	
	public BinarySearchTreeNode(T value) {
		super(value);
	}
	
	public BinarySearchTreeNode(BinarySearchTree<T> left, T value, BinarySearchTree<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public BinarySearchTreeNode<T> asLeaf(T left, T value, T right) {
		this.value = value;
		
		this.left = new BinarySearchTree<T>();
		this.left.setRoot(new BinarySearchTreeNode<T>(null, left, null));
		
		this.right = new BinarySearchTree<T>();
		this.right.setRoot(new BinarySearchTreeNode<T>(null, right, null));
		
		return this;
	}

	public BinarySearchTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTree<T> left) {
		this.left = left;
	}

	public BinarySearchTree<T> getRight() {
		return right;
	}

	public void setRight(BinarySearchTree<T> right) {
		this.right = right;
	}
}

package com.aussong.data.structure.binarySearchTree;

public class BinaryTreeNode<T extends Comparable<T>> implements Node<T> {
	protected T value;
	protected BinaryTree<T> left;
	protected BinaryTree<T> right;
	
	public BinaryTreeNode() {
	}
	
	public BinaryTreeNode(T value) {
		this.value = value;
	}
	
	public BinaryTreeNode(BinaryTree<T> left, T value, BinaryTree<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public BinaryTreeNode<T> asLeaf(T left, T value, T right) {
		this.value = value;
		
		this.left = new BinaryTree<T>();
		this.left.setRoot(new BinaryTreeNode<T>(null, left, null));
		
		this.right = new BinaryTree<T>();
		this.right.setRoot(new BinaryTreeNode<T>(null, right, null));
		
		return this;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}

	public BinaryTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryTree<T> left) {
		this.left = left;
	}

	public BinaryTree<T> getRight() {
		return right;
	}

	public void setRight(BinaryTree<T> right) {
		this.right = right;
	}
}

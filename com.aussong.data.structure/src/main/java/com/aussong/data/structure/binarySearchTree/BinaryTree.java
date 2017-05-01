package com.aussong.data.structure.binarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
	private BinaryTreeNode<T> root;
	
	public BinaryTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode<T> root) {
		this.root = root;
	}
	
	public List<BinaryTreeNode<T>> inorderTraversal() {
		List<BinaryTreeNode<T>> listAll = new ArrayList<BinaryTreeNode<T>>();
		if (this.root != null) {
			if (this.root.getLeft() != null) {
				List<BinaryTreeNode<T>> listLeft = root.getLeft().inorderTraversal();
				listAll.addAll(listLeft);
			}
			
			listAll.add(this.root);
			
			if (this.root.getRight() != null) {
				List<BinaryTreeNode<T>> listRight = root.getRight().inorderTraversal();
				listAll.addAll(listRight);
			}
		}
		
		return listAll;
	}
	
	public LinkedList<T> toLinkedList() {
		List<BinaryTreeNode<T>> nodes = inorderTraversal();
		LinkedBinaryTreeNode<T> prev = null;
		
		LinkedList<T> linkedList = new LinkedList<T>();
		int i = 0;
		int size = nodes.size();
		for (Iterator<BinaryTreeNode<T>> iter = nodes.iterator(); iter.hasNext(); i++) {
			BinaryTreeNode<T> node = iter.next();
			LinkedBinaryTreeNode<T> linkedNode = new LinkedBinaryTreeNode<T>(node);
			if (i == 0) {
				linkedNode.setPrev(null);
				linkedList.setStart(linkedNode);
				
				prev = linkedNode;
			}
			else {
				prev.setNext(linkedNode);
				linkedNode.setPrev(prev);
				
				prev = linkedNode;
				
				if (i == size - 1) {
					linkedNode.setNext(null);
				}
			}
		}
		
		return linkedList;
	}
}

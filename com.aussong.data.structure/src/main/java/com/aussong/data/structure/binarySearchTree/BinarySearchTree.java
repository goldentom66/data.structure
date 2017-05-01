package com.aussong.data.structure.binarySearchTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {
	private BinarySearchTreeNode<T> root;
	
	public BinarySearchTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(BinarySearchTreeNode<T> root) {
		this.root = root;
	}
	
	public List<BinarySearchTreeNode<T>> inorderTraversal() {
		List<BinarySearchTreeNode<T>> listAll = new ArrayList<BinarySearchTreeNode<T>>();
		if (this.root != null) {
			if (this.root.getLeft() != null) {
				List<BinarySearchTreeNode<T>> listLeft = root.getLeft().inorderTraversal();
				listAll.addAll(listLeft);
			}
			
			listAll.add(this.root);
			
			if (this.root.getRight() != null) {
				List<BinarySearchTreeNode<T>> listRight = root.getRight().inorderTraversal();
				listAll.addAll(listRight);
			}
		}
		
		return listAll;
	}
	
	public LinkedList<T> toLinkedList() {
		List<BinarySearchTreeNode<T>> nodes = inorderTraversal();
		LinkedBinarySearchTreeNode<T> prev = null;
		
		LinkedList<T> linkedList = new LinkedList<T>();
		int i = 0;
		int size = nodes.size();
		for (Iterator<BinarySearchTreeNode<T>> iter = nodes.iterator(); iter.hasNext(); i++) {
			BinarySearchTreeNode<T> node = iter.next();
			LinkedBinarySearchTreeNode<T> linkedNode = new LinkedBinarySearchTreeNode<T>(node);
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

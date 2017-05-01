package com.aussong.data.structure.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.aussong.data.structure.binarySearchTree.BinarySearchTree;
import com.aussong.data.structure.binarySearchTree.BinarySearchTreeNode;
import com.aussong.data.structure.binarySearchTree.LinkedList;

public class TestBinarySearchTreeToLinkedList {
	private BinarySearchTree<Integer> binaryTree;
	private LinkedList<Integer> linkedList;

	@Given("a binary search tree without left nodes and right nodes")
	public void aBinarySearchTreeWithoutLeftNodesAndRightNodes() {
		binaryTree = new BinarySearchTree<Integer>();
	}
	
	@When("the binary search tree does not have node")
	public void binaryTreeDoesNotHaveNode() {
		binaryTree.setRoot(null);
	}
	
	@Then("the linked list will not have node as well")
	public void linkedListDoesNotHaveNode() {
		linkedList = binaryTree.toLinkedList();
		assertNull(linkedList.getStart());
	}
	
	@When("the binary search tree is one node($value)")
	public void binaryTreeHasOneNode(int value) {
		binaryTree.setRoot(new BinarySearchTreeNode<Integer>(value));
	}
	
	@Then("the linked list will be one with that node($value)")
	public void linkedListHasOneNode() {
		linkedList = binaryTree.toLinkedList();
		assertEquals(linkedList.getStart().getValue(), binaryTree.getRoot().getValue());
	}

	@Given("a binary search tree with left nodes and right nodes")
	public void aBinarySearchTreeWithLeftNodesAndRightNodes() {
		binaryTree = new BinarySearchTree<Integer>();
	}
	
	@When("the binary search tree has 2 nodes: root({$root}), left(${left})")
	public void binaryTreeHasRootAndLeftNodes(int root, int left) {
		BinarySearchTree<Integer> leftTree = new BinarySearchTree<Integer>();
		leftTree.setRoot(new BinarySearchTreeNode<Integer>(left));
		
		binaryTree.setRoot(new BinarySearchTreeNode<Integer>(leftTree, root, null));
	}
	
	@Then("the linked list will be left(${left})->root({$root})")
	public void linkedListIsLeftToRoot() {
		linkedList = binaryTree.toLinkedList();
		assertEquals(linkedList.getStart().getNext().getValue(), binaryTree.getRoot().getValue());
	}
	
	@When("the binary search tree has 2 nodes: root(${root}), right(${right})")
	public void binaryTreeHasRootAndRightNodes(int root, int right) {
		BinarySearchTree<Integer> rightTree = new BinarySearchTree<Integer>();
		rightTree.setRoot(new BinarySearchTreeNode<Integer>(right));

		binaryTree.setRoot(new BinarySearchTreeNode<Integer>(null, root, rightTree));
	}
	
	@Then("the linked list will be root(${root})->right(${right})")
	public void linkedListIsRootToRight() {
		linkedList = binaryTree.toLinkedList();
		assertEquals(linkedList.getStart().getValue(), binaryTree.getRoot().getValue());
	}
	
	@When("the binary search tree has 7 nodes: root(${root}), left(${left}), left-left(${leftLeft}), left-right(${leftRight}), right(${right}), right-left(${rightLeft}), right-right(${rightRight})")
	public void binaryTreeHasAllNodes(int root, int left, int leftLeft, int leftRight, int right, int rightLeft, int rightRight) {
		BinarySearchTree<Integer> leftTree = new BinarySearchTree<Integer>();
		leftTree.setRoot(new BinarySearchTreeNode<Integer>().asLeaf(leftLeft, left, leftRight));

		BinarySearchTree<Integer> rightTree = new BinarySearchTree<Integer>();
		rightTree.setRoot(new BinarySearchTreeNode<Integer>().asLeaf(rightLeft, right, rightRight));

		binaryTree.setRoot(new BinarySearchTreeNode<Integer>(leftTree, root, rightTree));
	}
	
	@Then("the linked list will be left-left(${leftLeft})->left(${left})->left-right(${leftRight})->root(${root})->right-left(${rightLeft})->right(${right})->right-right(${rightRight})")
	public void linkedListIsAsListed(int root, int left, int leftLeft, int leftRight, int right, int rightLeft, int rightRight) {
		linkedList = binaryTree.toLinkedList();
		assertEquals(linkedList.getStart().getNext().getNext().getNext().getValue(), binaryTree.getRoot().getValue());
	}
}

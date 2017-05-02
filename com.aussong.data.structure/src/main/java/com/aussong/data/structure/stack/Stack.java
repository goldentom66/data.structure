package com.aussong.data.structure.stack;

import java.util.ArrayList;
import java.util.List;

import com.aussong.data.structure.Node;

public class Stack<T extends Comparable<T>> {

	public int top = 0;
	public int min = 0;
	public List<StackNode<T>> data = new ArrayList<StackNode<T>>();

	public void push(Node<T> node) {
		top++;
		
		StackNode<T> stackNode = new StackNode<T>();
		stackNode.node = node;
		stackNode.index = top;
		
		if(node.getValue() != null 
				&& (min <= 0 || get(min) == null
					|| node.getValue().compareTo(get(min).getValue()) < 0)) {
			stackNode.min = top;
			min = top;
		}
		else {
			stackNode.min = min;
		}
		
		data.add(stackNode);
	}

	public int size() {
		return top;
	}

	public Node<T> get(int index) {
		if (index < 1 || index > top) {
			return null;
		}
		
		if (data.get(index - 1) != null) {
			return data.get(index - 1).node;
		}
		return null;
	}

}

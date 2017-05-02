package com.aussong.data.structure.test;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.aussong.data.structure.DefaultNode;
import com.aussong.data.structure.stack.Stack;

public class TestStackWithMin {
	private Stack<Integer> stack;
	
	@Given ("a stack")
	public void aStack() {
		stack = new Stack<Integer>();
	}
	
	@When ("the stack is empty, pushing a node($value) into a stack")
	public void pushFirstNode(int value) {
		assert stack.size() == 0;
		stack.push(new DefaultNode<Integer>(value));
	}
	
	@Then ("the top will be 1, and the min index will be 1")
	public void topIncreasedOne() {
		assertEquals(stack.top, 1);
		assertEquals(stack.min, 1);
	}
	
	@When ("pushing a smallest node($minValue) into a stack")
	public void pushASmallestNode(int minValue) {
		assert stack.get(stack.min).getValue() > minValue;
		stack.push(new DefaultNode<Integer>(minValue));
	}
	@Then ("the top will increase 1 to 2, and the min index will be same as top, that is, 2")
	public void minSameTop() {
		assertEquals(stack.top, 2);
		assertEquals(stack.min, stack.top);
	}
	@When ("pushing a larger node($nonMinValue) into a stack")
	public void pushALargerNode(int nonMinValue) {
		assert stack.get(stack.min).getValue() <= nonMinValue;
		stack.push(new DefaultNode<Integer>(nonMinValue));
	}
	@Then ("the top will increase 1 to 3, but the min index will be same as before, that is, 2")
	public void minKeepAsBefore() {
		assertEquals(stack.top, 3);
		assertEquals(stack.min, 2);
	}
}

package com.dub;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dub.util.SimpleStack;

public class StackTestJunit {

	@Test
	public void testAdd() {
		
		SimpleStack<String> stack = new SimpleStack<>();
		
		assertTrue(stack.isEmpty());
		
		stack.push("sator");
		assertFalse(stack.isEmpty());
		assertEquals("sator", stack.peek());
		
		stack.push("arepo");

		assertEquals("arepo", stack.peek());
		
		stack.push("tenet");
		assertEquals("tenet", stack.peek());
		
		assertEquals("tenet", stack.pop());
		
		assertEquals("arepo", stack.peek());
		
		assertEquals("arepo", stack.pop());
		assertEquals("sator", stack.pop());
		assertTrue(stack.isEmpty());

	}

}

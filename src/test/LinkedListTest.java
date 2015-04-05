package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nagesh.learneroo.LinkedList;

public class LinkedListTest {

	@Test
	public void emptyLinkedList_shouldBeEmpty() {
		assertTrue(new LinkedList<Integer>().isEmpty());
	}
	
	@Test
	public void emptyLinkedList_shouldHaveZeroSize() {
		assertEquals(0, new LinkedList<Integer>().size());
	}

	@Test
	public void add_shouldIncrementSizeByOne() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
		
		list.add(1);
		assertEquals(1, list.size());
		
		list.add(2);
		assertEquals(2, list.size());
		
	}
	
	@Test
	public void contains_shouldReturnTrueAfterAdd() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		assertTrue(list.contains(1));
		
		list.add(2);
		assertTrue(list.contains(2));
	}
	
	@Test
	public void remove_shouldDecreaseSizeByOne() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		assertEquals(3, list.size());
		
		list.remove((Object)1);
		assertEquals(2, list.size());
		
		list.remove((Object)2);
		assertEquals(1, list.size());
	}
	
	
	
}

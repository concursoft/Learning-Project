package com.nagesh.learneroo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

	private Node<E> head = new Node<E>();
	
	@Override
	public int size() {
		int size = 0;
		Node<E> currentNode = head;
		while (currentNode.next != null) {
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head.next == null;
	}

	@Override
	public boolean contains(Object o) {
		Node<E> currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.next.data.equals(o))
				return true;
			currentNode = currentNode.next;
		}
		
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		Node<E> currentNode = head;
		while (currentNode.next != null)
			currentNode = currentNode.next;
		currentNode.next = new Node<E>(e);
		
		return true;
	}

	@Override
	public boolean remove(Object o) {
		Node<E> currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.next.data.equals(o)) {
				currentNode.next = currentNode.next.next;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}


class Node<E> {
	E data;
	Node<E> next;
	
	public Node() {
		
	}
	
	public Node(E data) {
		this.data = data;
	}
}
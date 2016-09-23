package com.vershininanp.javatasks.task4.node;

public class Node<E> {
	private E data;
	private Node<E> next;
	private Node<E> prev;

	public Node(E element) {
		data = element;
		next = null;
		prev = null;
	}

	public E getData() {
		return data;
	}

	public Node<E> getNext() {
		return next;
	}
	
	public Node<E> getPrev() {
		return prev;
	}

	public void setData(E element) {
		data = element;
	}

	public void setNext(Node<E> nextIndex) {
		next = nextIndex;
	}
	
	public void setPrev(Node<E> prevIndex) {
		prev = prevIndex;
	}
}

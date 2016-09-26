package com.vershininanp.javatasks.task4.simplelinkedlist;

import com.vershininanp.javatasks.task4.node.Node;
import com.vershininanp.javatasks.task4.listiterator.ListIterator;
import java.util.Iterator;

public class SimpleLinkedList<E> implements Iterable<E> {	

	private Node<E> head;    
    private int countElements;
	private int i;
	
	public SimpleLinkedList() {
		head = null;
		countElements = 0;
    }
	
	public int size() {
		return countElements;
    }
	
	public void add(E element) {
		if (head == null) {
			head = new Node<E>(element);
		}
		
		Node<E> elementInsert = new Node<E>(element);
		Node<E> elementCurrent = head;
		
		while (elementCurrent.getNext() != null) {
			elementCurrent = elementCurrent.getNext();
		}
		elementCurrent.setNext(elementInsert);
		elementInsert.setPrev(elementCurrent);
		
		countElements++;
	}
	
	public void add(int index, E element) {
		Node<E> elementInsert = new Node(element);
		Node<E> elementCurrent = head;		
 
		if (elementCurrent != null) {			
			for (i = 0; i < index; i++) {
				elementCurrent = elementCurrent.getNext();
			}
		} 				
			
		elementInsert.setNext(elementCurrent.getNext());	
		elementCurrent.setNext(elementInsert); 
		elementInsert.setPrev(elementCurrent);
		
		Node<E> elementFollowing = elementInsert.getNext();
		if (elementFollowing != null) {
			elementFollowing.setPrev(elementInsert);	
		}			
		countElements++;
	}
	
	public void addFirst(E element) {
		Node<E> elementInsert = new Node(element);
		Node<E> elementCurrent = head;	 					
			
		elementInsert.setNext(elementCurrent.getNext());	
		elementCurrent.setNext(elementInsert); 
		elementInsert.setPrev(elementCurrent);
		
		Node<E> elementFollowing = elementInsert.getNext();
		if (elementFollowing != null) {
			elementFollowing.setPrev(elementInsert);	
		}			
		countElements++;
	}
	
	public boolean remove(int index) {
		if (index < 1 || index > size()) {
			return false;
		}
		
		Node<E> elementCurrent = head;
		for (int i = 0; i < index; i++) {
			if (elementCurrent.getNext() == null) {
				return false;
			}
 			elementCurrent = elementCurrent.getNext();
		}			
		elementCurrent.setNext(elementCurrent.getNext().getNext());		
			
		Node<E> elementThroughOne = elementCurrent.getNext();
		if (elementCurrent.getNext() != null) {
			elementThroughOne.setPrev(elementCurrent);	
		}
		
		countElements--;
		return true; 
	}
	
	public boolean removeFirst() {			
		head.setNext(head.getNext().getNext());		
			
		Node<E> elementThroughOne = head.getNext();
		if (head.getNext() != null) {
			elementThroughOne.setPrev(head);	
		}
		
		countElements--;
		return true; 
	}
	
	public boolean removeLast() {		
		if (head == null) {
			return false;
		}
		Node<E> elementCurrent = head;
		
		for (int i = 0; i < size(); i++) {
			elementCurrent = elementCurrent.getNext();
		}
		
		Node<E> elementPrevious = elementCurrent.getPrev();
		elementCurrent.setPrev(null);
		elementPrevious.setNext(elementCurrent.getNext());
			
		countElements--;
		return true; 
	}

	public E get(int index) {
		if (index < 0) {
			return null;
		}
			
		Node<E> elementCurrent = null;
		if (head != null) {
			elementCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (elementCurrent.getNext() == null) {
					return null;
				}
				elementCurrent = elementCurrent.getNext();
			}
			return (E)elementCurrent.getData();
		}
		return (E)elementCurrent;
 
	}	
	
	@Override
	public ListIterator<E> iterator() {
        return new ListIterator<E>(this);
		
    }
}





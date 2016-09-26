package com.vershininanp.javatasks.task4.listiterator;

import com.vershininanp.javatasks.task4.node.Node;
import com.vershininanp.javatasks.task4.simplelinkedlist.SimpleLinkedList;
import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {
	private SimpleLinkedList<E> linkedList;
	private E elementList;
	private int index;
	
	public ListIterator(SimpleLinkedList<E> sl) {
		linkedList = sl;
		index = 0;		
        elementList = sl.get(index);
    }
	
	@Override
	public boolean hasNext() {				
		if(index < linkedList.size()) {
            return true;
		} else {
			return false;
		}     
    }
	
	@Override
    public E next() {
		E elementList = linkedList.get(index);
		index++;
		return elementList;
	}

}



package com.vershininanp.javatasks.task4.main;

import com.vershininanp.javatasks.task4.simplelinkedlist.SimpleLinkedList;
import com.vershininanp.javatasks.task4.listiterator.ListIterator;

public class Main {	

	public static void main(String[] args) {
		SimpleLinkedList<String> linkedlist  = new SimpleLinkedList<String>();
		linkedlist.add("Hello ");
		linkedlist.add("world ");
		linkedlist.add("animals ");
		linkedlist.add("lady ");		
		linkedlist.add(2, "gentlemen");
		
		linkedlist.removeFirst();		
		linkedlist.addFirst("Bye ");
		linkedlist.removeLast();				
		linkedlist.add("faces ");		
				
		ListIterator<String> iteratorLList = linkedlist.iterator();
		while(iteratorLList.hasNext()){		
			System.out.println(iteratorLList.next());
		}
	}
}

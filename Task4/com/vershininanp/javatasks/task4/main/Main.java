package com.vershininanp.javatasks.task4.main;

import com.vershininanp.javatasks.task4.simplelinkedlist.SimpleLinkedList;

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
		for (int i = 0; i < linkedlist.size(); i++) {		
			System.out.println(linkedlist.get(i)+ "\n" + linkedlist.getPrev(i) + "\n" + linkedlist.getNext(i) + "\n");
		}
		
		linkedlist.removeLast();				
		linkedlist.add("faces ");		
		for (int i = 0; i < linkedlist.size(); i++) {		
			System.out.println(linkedlist.get(i)+ "\n");
		}
		
	}
}

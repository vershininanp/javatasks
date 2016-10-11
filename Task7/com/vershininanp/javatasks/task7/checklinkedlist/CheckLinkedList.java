package com.vershininanp.javatasks.task5.checklinkedlist;

import java.io.*;
import java.util.*;

public class CheckLinkedList {	
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList();
		int n = 20;
		for(int i = 1; i < n; i++) {
			numbers.add(i);
		}
		long start = System.nanoTime();
		while(numbers.size() > 1) {
			for(int i = 1; i < numbers.size(); i = i + 2) {
				numbers.remove(i);
			}
		}
		long end = System.nanoTime();		
		System.out.println(end - start);
    }
}
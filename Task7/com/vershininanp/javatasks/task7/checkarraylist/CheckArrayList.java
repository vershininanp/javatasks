package com.vershininanp.javatasks.task5.checkarraylist;

import java.io.*;
import java.util.*;

public class CheckArrayList {	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
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


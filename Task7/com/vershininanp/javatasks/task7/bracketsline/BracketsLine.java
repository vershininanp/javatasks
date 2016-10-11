package com.vershininanp.javatasks.task5.bracketsline;

import java.io.*;
import java.util.*;

public class BracketsLine {			
	public static void main(String[] args) {
		try {
			LinkedList<String> checkedBrackets = new LinkedList(); 
			String line = "[[[{}]]][][[]][()]{}[]{}";
			for(int i = 0; i < line.length(); i++) {
				String str = line.substring(i, i+1);
				switch (str) {
					case "(": checkedBrackets.add(str); 
						break;
					case "[": checkedBrackets.add(str); 
						break;
					case "{": checkedBrackets.add(str); 
						break;
					case ")": 
						if(checkedBrackets.getLast().equals("(")) {
							checkedBrackets.removeLast();
						} else {
							throw new BracketsException("Exception! Brackets placed incorrectly!");
						} ;
						break;
					case "]": 
						if(checkedBrackets.getLast().equals("[")) {
							checkedBrackets.removeLast();
						} else {
							throw new BracketsException("Exception! Brackets placed incorrectly!");
						} ;
						break;
					case "}": 
						if(checkedBrackets.getLast().equals("{")) {
							checkedBrackets.removeLast();
						} else {
							throw new BracketsException("Exception! Brackets placed incorrectly!");
						} ;
						break;	
					default: ;
						break;
				}			
			}
			
			if((checkedBrackets != null) && !checkedBrackets.isEmpty()) {
				throw new BracketsException("Exception! Brackets placed incorrectly!");
			}
		} catch (NoSuchElementException ex){
			System.out.println("Exception! Brackets placed incorrectly!"); 		
		
		} catch (BracketsException ex) { 
			System.out.println(ex.getMessage());				
		}
    }
}

class BracketsException extends Exception {
	String message;
	
	public BracketsException(String msg) {
		message = msg;
	}
	
	public String getMessage(){
		return message;
	}
}
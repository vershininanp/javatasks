package com.vershininanp.javatasks.task3.workfile;

import java.io.*;
import java.util.*;

public class WorkFile {	
	public void write(String fileName, String text) {		
		File file = new File(fileName);
	 
		try {
			if(!file.exists()){
				file.createNewFile();
			}
	 
			FileWriter writer = new FileWriter(file.getAbsoluteFile());
	 
			try {
				writer.write(text);
			} finally {
				writer.close();
			}
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<String> read(String fileName) throws FileNotFoundException {		
		ArrayList<String> words = new ArrayList();
		File file = new File(fileName);
		
		if (!file.exists()){
			throw new FileNotFoundException(file.getName());
		}
		
		try(BufferedReader buffer = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {			
			String line;
			try {
				while((line = buffer.readLine()) != null) { 
					words.add(line);					
				}				
			} finally {            
				buffer.close();
			}			
		} catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		
		return words;
	}

}
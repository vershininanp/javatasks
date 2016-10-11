package com.vershininanp.javatasks.task8.main;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {	

	public static void main(String[] args) {
		String fileName = "D:\\Java trainings\\Tasks\\Task8\\test.zip";
		ZipEntry entry;
		
		try { 
			ArrayList<String> text = new ArrayList();
			ZipInputStream zip = new ZipInputStream(new FileInputStream(fileName));
			
			while((entry = zip.getNextEntry()) != null) {
				BufferedReader buffer = new BufferedReader(new InputStreamReader(zip, "UTF-8"));
				String line;
				try {
					while((line = buffer.readLine()) != null) { 
						text.add(line);	
						System.out.println(line);	
					}				
				} finally {            
					buffer.close();
				}
			}			
		}  catch (Exception ex) { 
			System.out.println(ex.getMessage());			
		}
	}
}


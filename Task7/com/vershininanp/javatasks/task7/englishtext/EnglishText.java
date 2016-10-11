package com.vershininanp.javatasks.task5.englishtext;

import java.io.*;
import java.util.*;

public class EnglishText {	
	private static ArrayList<String> checkedWords = new ArrayList(); 
		
	public static void main(String[] args) {
		File f = new File("D:\\Java trainings\\Tasks\\Task5\\com\\vershininanp\\javatasks\\task5\\libraries.txt");
		try(BufferedReader buffer = new BufferedReader(new FileReader(f))) {
			ArrayList<String> words = new ArrayList();
			String line;
			int count = 0;
			
			while((line = buffer.readLine()) != null) {             
				line = line.replaceAll("[^a-zA-Z \\s]", "");
				for (String word: line.split(" ")) {
					words.add(word);
				}
			}
			
			Collections.sort(words, new Comparator<String>() {
				public int compare(String o1, String o2) {					
					return o1.compareTo(o2);
				}
			});
			
			for (int i = 0; i < words.size(); i++) { 
				if (checkExistence(words.get(i))) {
					for (int j = 0; j < words.size(); j ++) {
						if (words.get(i).equals(words.get(j))) {
							count++;
							checkedWords.add(words.get(i));
						} 
					}
				}	
				if (count > 0) {
					System.out.println(words.get(i) + " - " + count);					
				}
				count = 0;
			}
			
		} catch(IOException ex ){
			System.out.println(ex.getMessage());
		}
	}
	
	private static boolean checkExistence (String word) {
        for (int k = 0; k < checkedWords.size(); k++) {                            
            if (word.equals(checkedWords.get(k))) {
				return false;
			}
        }
        return true;
    }
}
package com.vershininanp.javatasks.task3.main;

import java.io.*;
import java.util.*;
import com.vershininanp.javatasks.task3.departmentroom.DepartmentRoom;
import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;
import com.vershininanp.javatasks.task3.deansoffice.DeansOffice;
import com.vershininanp.javatasks.task3.lectureroom.LectureRoom;
import com.vershininanp.javatasks.task3.workfile.WorkFile;

public class Main {	

	public static void main(String[] args) {
		try { 
			String text = "";
			String fileName = "D:\\Java trainings\\Tasks\\Task3\\com\\vershininanp\\javatasks\\task3\\test.txt";
						
			ArrayList<DepartmentRoom> departmentRooms = new ArrayList();
			departmentRooms.add(new EducationalRoom(1, "17"));
			departmentRooms.add(new EducationalRoom(1, "10"));
			departmentRooms.add(new DeansOffice(1, "13", "Ivanov"));
			departmentRooms.add(new DeansOffice(1, "16", "Petrov"));
			departmentRooms.add(new LectureRoom(1, "15", 15));
			departmentRooms.add(new LectureRoom(2, "20", 10));
			
			ArrayList<DepartmentRoom> lectureRooms = new ArrayList();
		
			for(int i = 0; i < departmentRooms.size(); i++)	{
				for(int j = 0; (j < departmentRooms.size()) && (j != i); j++) {
					if((departmentRooms.get(i).equals(departmentRooms.get(j))) 
							&& (departmentRooms.get(i).getClass() != departmentRooms.get(j).getClass())
							&& (departmentRooms.get(i).getClass().getName() != "com.vershininanp.javatasks.task3.educationalroom.EducationalRoom")) {
						throw new DublicateException("Exception! There was a duplicate of the room!");
					} 
				}				
				departmentRooms.get(i).open(); 
								
				if (departmentRooms.get(i).getClass().getName() == "com.vershininanp.javatasks.task3.educationalroom.LectureRoom") {					
					lectureRooms.add(departmentRooms.get(i));
				}
			}

			System.out.println("Sort by number of room"); 	
			Collections.sort(departmentRooms, new Comparator<DepartmentRoom>() {
				public int compare(DepartmentRoom o1, DepartmentRoom o2) {
					return o1.getNumberOfRoom().compareTo(o2.getNumberOfRoom());
				}
			});
			
			for(int i = 0; i < departmentRooms.size(); i++)	{								
				System.out.println(departmentRooms.get(i).getNumberOfRoom()); 				
			}
			
			System.out.println("Sort by type and number of room"); 	
			Collections.sort(departmentRooms, new Comparator<DepartmentRoom>() {
				public int compare(DepartmentRoom o1, DepartmentRoom o2) {
					int sortByType = o1.getClass().getName().compareTo(o2.getClass().getName());
					if(sortByType != 0) {
						return sortByType;
					}
					return o1.getNumberOfRoom().compareTo(o2.getNumberOfRoom());
				}
			});
			
			for(int i = 0; i < departmentRooms.size(); i++)	{	
				text = text + departmentRooms.get(i).getNumberOfRoom() +" " + departmentRooms.get(i).getClass().getName() + "\r\n";
				System.out.println(departmentRooms.get(i).getNumberOfRoom() +" " + departmentRooms.get(i).getClass().getName()); 				
			}	
		
			WorkFile wfile = new WorkFile();
			wfile.write(fileName, text);
			System.out.println(wfile.read(fileName));
											
		} catch (IllegalArgumentException ex) { 
			System.out.println("IllegalArgumentException!"); 
			return;			
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException!"); 
			return;			
		}  catch (DublicateException ex) { 
			System.out.println(ex.getMessage());			
		}  catch (FileNotFoundException ex) { 
			System.out.println(ex.getMessage());			
		}
	}
}

class DublicateException extends Exception {
	
	String message;
	
	public DublicateException(String msg) {
		message = msg;
	}
	
	public String getMessage(){
		return message;
	}
}
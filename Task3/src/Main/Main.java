package src.Main;

import java.util.*;
import src.DepartmentRoom.DepartmentRoom;
import src.EducationalRoom.EducationalRoom;
import src.DeansOffice.DeansOffice;
import src.LectureRoom.LectureRoom;


public class Main {
	
	public static void main(String[] args) {
		DepartmentRoom[] departmentRooms = {new EducationalRoom(1, 10), new EducationalRoom(1, 11), 
											new DeansOffice(1, 10, "Ivanov"), new DeansOffice(1, 11, "Petrov"), 
											new LectureRoom(1, 10, 15), new LectureRoom(1, 11, 10)};
											
		ArrayList<LectureRoom> lectureRooms = new ArrayList();
		
		for(int i = 0; i < departmentRooms.length; i++)	{
			departmentRooms[i].open();
			
			if (departmentRooms[i] instanceof LectureRoom) {
				lectureRooms.add(departmentRooms[i]);
			}
		}
		
	}
}
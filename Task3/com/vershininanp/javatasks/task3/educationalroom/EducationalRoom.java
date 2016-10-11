package com.vershininanp.javatasks.task3.educationalroom;

import com.vershininanp.javatasks.task3.departmentroom.DepartmentRoom;

public class EducationalRoom extends DepartmentRoom {
	
	private String numberOfRoom;
	
	public EducationalRoom(int floor, String n) {
		super(floor);
		numberOfRoom = n;
				
		if(floor != Integer.parseInt(n.substring(0, 1))) {
			throw new IllegalArgumentException();
		}
		
		if(numberOfRoom == null) {
			throw new NullPointerException();
		}
	}	
		
	public void open() {		
	
	}	
	
	public String getNumberOfRoom(){
		return numberOfRoom;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) { 
			return false;
		}
		
		/*if (this.getClass() != obj.getClass()) {
			return false;
		}*/
				
		EducationalRoom edRoom = (EducationalRoom) obj;
		if (this.numberOfRoom != edRoom.getNumberOfRoom()){
			return false;
		}
		
		return true;
	}


}
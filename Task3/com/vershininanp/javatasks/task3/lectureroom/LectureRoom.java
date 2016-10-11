package com.vershininanp.javatasks.task3.lectureroom;

import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;

public class LectureRoom extends EducationalRoom {

	int numberOfSeats;
	//EducationalRoom edRoom;
	
	public LectureRoom(int floor, String numberOfRoom, int ns) {
		super(floor, numberOfRoom);	
		numberOfSeats = ns;
	}
	
	public void open() {
		System.out.println("LectureRoom opens!");
	}
			
}
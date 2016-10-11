package com.vershininanp.javatasks.task3.deansoffice;

import com.vershininanp.javatasks.task3.educationalroom.EducationalRoom;
import com.vershininanp.javatasks.task3.timetableroom.TimetableRoom;
import com.vershininanp.javatasks.task3.timetableroomimpl.TimetableRoomImpl;

public class DeansOffice extends EducationalRoom implements TimetableRoom {
	
	String nameDean;
	TimetableRoom timetableRoom;
	static final Integer GET_HOUR_STARTED = 8;
	static final Integer GET_HOUR_SHUTDOWN = 17;	
	
	public DeansOffice(int floor, String numberOfRoom, String nd) {
		super(floor, numberOfRoom);	
		nameDean = nd;
		timetableRoom = new TimetableRoomImpl(GET_HOUR_STARTED, GET_HOUR_SHUTDOWN);
	}	
	
	public int getWorkdaySize() {
		return timetableRoom.getWorkdaySize();
	}	
	
	public void open() {
		System.out.println("DeansOffice opens!");	
	}
	
}
package com.vershininanp.javatasks.task3.timetableroomimpl;

import com.vershininanp.javatasks.task3.timetableroom.TimetableRoom;

public class TimetableRoomImpl implements TimetableRoom {
	int hourStarted;
	int hourShutdown;
	
	public TimetableRoomImpl(int hStart, int hShut) {
		hourStarted = hStart;
		hourShutdown = hShut;
	}		
	
	@Override
	public int getWorkdaySize() {
		return hourShutdown - hourStarted;	
	}
	
}
package src.TimetableRoomImpl;

import src.TimetableRoom.TimetableRoom;

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
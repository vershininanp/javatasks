package src.DeansOffice;

import src.EducationalRoom.EducationalRoom;
import src.TimetableRoom.TimetableRoom;
import src.TimetableRoomImpl.TimetableRoomImpl;

public class DeansOffice extends EducationalRoom implements TimetableRoom {
	
	String nameDean;
	TimetableRoom timetableRoom;
	static final Integer GET_HOUR_STARTED = 8;
	static final Integer GET_HOUR_SHUTDOWN = 17;	
	
	public DeansOffice(int floor, int numberOfRoom, String nd) {
		super(floor, numberOfRoom);	
		nameDean = nd;
		timetableRoom = new TimetableRoomImpl(GET_HOUR_STARTED, GET_HOUR_SHUTDOWN);
	}
	
	@Override
	public int getWorkdaySize() {
		timetableRoom.getWorkdaySize();
	}	
	
	public void open() {
		System.out.println("DeansOffice opens!");	
	}
	
}
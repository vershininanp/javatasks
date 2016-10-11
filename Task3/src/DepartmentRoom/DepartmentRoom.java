package src.DepartmentRoom;

public abstract class DepartmentRoom {
	
	int floor;
	
	public DepartmentRoom(int f) {
		floor = f;
	}
	
	public abstract void open();
	
}